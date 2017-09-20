package com.gx.command.fp

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
  * This is an implementation of Command Pattern in functional programming style. The differences between
  * object oriented style and this are:
  * 1. Receiver(Television) is an invariable object.
  * 2. Command is actual a function: (Television) => Television. Every command has return value. It generates
  * a new 'Television' every time.
  * 3. Invoker(RemoteController) executes command in lazy mode.
  *
  */


/**
  * App is the client
  */
object App extends App {

  val remote = new RemoteController(Television())
  remote.invoke(Command.setChannel(1))
  remote.invoke(Command.setChannel(5))
  remote.invoke(Command.setVolume(3))
  remote.invoke(Command.setVolume(20))
  println(remote.get())
  remote.undo()
  remote.undo()
  remote.undo()
  remote.undo()
  remote.undo()
  remote.undo()
  println(remote.get())
  remote.redo()
  remote.redo()
  remote.redo()
  println(remote.get())

}
