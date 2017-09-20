package com.gx.command.fp

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
class RemoteController(tv: Television) {
  private val historyStack = mutable.ArrayStack[Command.Type]()
  private val redoStack = mutable.ArrayStack[Command.Type]()

  def invoke(cmd: Command.Type): Unit = {
    historyStack.push(cmd)
  }

  def undo(): Unit = {
    if (historyStack.nonEmpty) {
      val cmd = historyStack.pop()
      redoStack.push(cmd)
    }
  }

  def redo(): Unit = {
    if (redoStack.nonEmpty) {
      val cmd = redoStack.pop()
      historyStack.push(cmd)
    }
  }

  def get(): Television = {
    historyStack.foldRight(tv)((cmd, tv) => cmd(tv))
  }

}
