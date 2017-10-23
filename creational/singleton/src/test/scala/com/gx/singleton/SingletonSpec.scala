package com.gx.singleton

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
class SingletonSpec extends FlatSpec with Matchers {

  it should "return the same object with multiple calls in same thread" in {
    val s1 = Singleton
    val s2 = Singleton
    s1 should be(s2)
  }

  it should "return the same object with multiple calls in different threads" in {
    val ss = (1 to 4).par.map(_ => Singleton)
    val expected = Singleton
    ss.foreach(s => s should be(expected))
  }
}
