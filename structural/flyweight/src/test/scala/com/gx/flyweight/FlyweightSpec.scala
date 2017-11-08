package com.gx.flyweight

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
class FlyweightSpec extends FlatSpec with Matchers {

  it should "return same tea object" in {
    val maker = new TeaMaker()
    val tea1 = maker.make(Tea.GreenTea)
    val tea2 = maker.make(Tea.GreenTea)
    tea1 should be(tea2)
  }

  it should "return different tea object for unshared flyweight object" in {
    val maker = new TeaMaker()
    val tea1 = maker.make(Tea.UnsharedTea)
    val tea2 = maker.make(Tea.UnsharedTea)
    tea1 should not be tea2
  }

}
