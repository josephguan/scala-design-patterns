package com.gx.command.oo

import scala.collection.mutable

/**
  * Copyright 2017 josephguan
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  *
  */

/**
  * RemoteController is the invoker.
  *
  */
class RemoteController {
  private val undoStack = mutable.ArrayStack[Command]()
  private val redoStack = mutable.ArrayStack[Command]()

  def invoke(cmd: Command, tv: Television): Unit = {
    cmd.execute(tv)
    undoStack.push(cmd)
    redoStack.clear()
  }

  def undo(): Unit = {
    if (undoStack.nonEmpty) {
      val cmd = undoStack.pop()
      redoStack.push(cmd)
      cmd.undo()
    }
  }

  def redo(): Unit = {
    if (redoStack.nonEmpty) {
      val cmd = redoStack.pop()
      undoStack.push(cmd)
      cmd.redo()
    }
  }

}
