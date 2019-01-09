package com.gx.typeclasses

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
class TypeClassesSpec extends FlatSpec with Matchers {

  it should "say hello" in {
    val human = new Human()

    implicit val SpeakableInt = new Speakable[Int] {
      override def say(): String = "I'm a Number."
    }

    human.sayHelloTo(2) should be("Human say hello, get reply: I'm a Number.")

  }

}
