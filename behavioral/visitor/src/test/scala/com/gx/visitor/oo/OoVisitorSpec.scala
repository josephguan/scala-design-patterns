package com.gx.visitor.oo

import java.io.ByteArrayOutputStream

import com.gx.visitor.fp._
import org.scalatest.{FlatSpec, FunSuite, Matchers}

/**
  * Copyright 2018 josephguan
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
class OoVisitorSpec extends FlatSpec with Matchers {

  it should "3 speakers" in {
    val zoo = new Zoo(new Monkey, new Lion, new Dolphin)
    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      zoo.accept(new Speak())
    }
    val lines = buffer.toString.split("\r\n")
    lines.length should be(3)
  }

  it should "only 1 swimmer" in {
    val zoo = new Zoo(new Monkey, new Lion, new Dolphin)
    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      zoo.accept(new Swim())
    }
    val lines = buffer.toString.split("\r\n")
    lines.length should be(1)
  }

}
