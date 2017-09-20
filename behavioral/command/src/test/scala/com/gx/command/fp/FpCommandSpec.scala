package com.gx.command.fp

import org.scalatest.{FlatSpec, Matchers}

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
class FpCommandSpec extends FlatSpec with Matchers {

  it should "change channel and volume according to commands" in {
    val remoter = new RemoteController(Television())

    remoter.invoke(Command.setChannel(5))
    remoter.invoke(Command.setVolume(10))
    remoter.get() should be(Television(5, 10))
  }

  it should "undo previous commands" in {
    val remoter = new RemoteController(Television())

    remoter.invoke(Command.setChannel(5))
    remoter.invoke(Command.setVolume(10))
    remoter.undo()
    remoter.get() should be(Television(5, 0))
    remoter.undo()
    remoter.get() should be(Television(0, 0))
    remoter.undo()
    remoter.get() should be(Television(0, 0))
  }

  it should "redo previous commands" in {
    val remoter = new RemoteController(Television())

    remoter.invoke(Command.setChannel(5))
    remoter.invoke(Command.setVolume(10))
    remoter.undo()
    remoter.undo()
    remoter.undo()
    remoter.redo()
    remoter.get() should be(Television(5, 0))
    remoter.redo()
    remoter.get() should be(Television(5, 10))
    remoter.redo()
    remoter.get() should be(Television(5, 10))
  }


}
