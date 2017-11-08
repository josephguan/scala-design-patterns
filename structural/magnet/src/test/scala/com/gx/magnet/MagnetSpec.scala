package com.gx.magnet

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
class MagnetSpec extends FlatSpec with Matchers {

  it should "double Int" in {
    val doubling = new Doubling()
    doubling.double(2) should be(4)
    println(doubling.double(List(1, 2, 3)))
    println(doubling.double(List("a", "b", "c")))
    println(doubling.double("a", 5))
  }

  it should "double List[Int]" in {
    val doubling = new Doubling()
    doubling.double(List(1, 2, 3)) should be(List(2, 4, 6))
  }

  it should "double List[String]" in {
    val doubling = new Doubling()
    doubling.double(List("a", "b", "c")) should be(List("a", "b", "c", "a", "b", "c"))
  }

  it should "duplicate String with specific times" in {
    val doubling = new Doubling()
    doubling.double("a", 5) should be("aaaaa")
  }

}
