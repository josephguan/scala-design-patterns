package com.gx.composite

import java.io.ByteArrayOutputStream

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
class CompositeSpec extends FlatSpec with Matchers {

  it should "compose several actions into one action" in {
    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      val action = new CompositeAction(new Forward, new TurnLeft, new TurnRight)
      action.act()
    }
    buffer.toString should be("go forward\r\nturn left\r\nturn right\r\n")
  }


  it should "compose composite actions into one action" in {
    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      val action1 = new CompositeAction(new Forward, new TurnLeft, new TurnRight)
      val action2 = new CompositeAction(new Forward, action1, new TurnRight)
      action2.act()
    }
    buffer.toString should be("go forward\r\ngo forward\r\nturn left\r\nturn right\r\nturn right\r\n")
  }


}
