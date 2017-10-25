package com.gx.factorykit

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
class FactoryKitSpec extends FlatSpec with Matchers {

  it should "create objects using local factory kit" in {
    val factory = WeaponFactoryKit.factory { builder =>
      builder.put("axe1", () => new Axe())
      builder.put("axe2", () => new Axe())
      builder.put("sword", () => new Sword())
    }

    val axe1 = factory.create("axe1")
    val axe2 = factory.create("axe2")

    axe1.toString should be(axe2.toString)
  }
}
