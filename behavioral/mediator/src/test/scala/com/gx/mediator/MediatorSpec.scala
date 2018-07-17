package com.gx.mediator

import java.io.ByteArrayOutputStream

import org.scalatest.{FlatSpec, Matchers}

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
class MediatorSpec extends FlatSpec with Matchers {

  it should "receive message from other countries" in {
    val china = new China
    val usa = new USA
    val canada = new Canada

    // united nations organization
    val united = new UnitedNations
    united.addMember(china)
    united.addMember(usa)
    united.addMember(canada)

    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      china.declare("Hello World")
    }

    val msg = buffer.toString.split("\r\n")
    msg(1) should be("USA received: 'Hello World'")
    msg(2) should be("Canada received: 'Hello World'")



  }

}
