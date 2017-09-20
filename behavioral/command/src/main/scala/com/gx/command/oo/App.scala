package com.gx.command.oo

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
  * App is the client
  *
  */
object App extends App {
  val tv = new Television()
  val remote = new RemoteController()

  remote.invoke(new SetChannelCommand(1), tv)
  remote.invoke(new SetChannelCommand(5), tv)
  remote.invoke(new SetVolumeCommand(3), tv)
  remote.invoke(new SetVolumeCommand(20), tv)
  tv.show()

  remote.undo()
  remote.undo()
  remote.undo()
  remote.undo()
  remote.undo()
  remote.undo()
  tv.show()

  remote.redo()
  remote.redo()
  remote.redo()
  tv.show()

}
