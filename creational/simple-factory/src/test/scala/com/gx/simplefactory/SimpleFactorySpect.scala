package com.gx.simplefactory

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
class SimpleFactorySpect extends FlatSpec with Matchers {

  it should "create AddOperation" in {
    val op = Operation("+")
    op.getResult(1, 2) should be(3)
  }

  it should "create SubOperation" in {
    val op = Operation("-")
    op.getResult(1, 2) should be(-1)
  }

  it should "create MulOperation" in {
    val op = Operation("*")
    op.getResult(1, 2) should be(2)
  }

  it should "create DivOperation" in {
    val op = Operation("/")
    op.getResult(1, 2) should be(0.5)
  }
}
