package com.gx.selflesstrait

import org.scalatest.FlatSpec

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

class SelflessTraitSpec extends FlatSpec {

  // Matchers in scalatest is a good example of Selfless Trait Pattern!!
  import org.scalatest.Matchers._

  it should "use Friendly by mixin" in {
    val guy = new Object with Friendly
    guy.greet() should be("Hello!")
  }

  it should "use Friendly by import" in {
    import Friendly._
    greet() should be("Hello!")
  }

}
