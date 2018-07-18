package com.gx.templatemethod

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
class TemplateSpec extends FlatSpec with Matchers {

  it should "order vegetable for vegan" in {
    val vegan = new Vegan
    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      vegan.goToRestaurant()
    }
    buffer.toString.split("\r\n").head should be ("I am eating vegetable.")
  }

  it should "order steak for meatlover" in {
    val meatLover = new MeatLover()
    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      meatLover.goToRestaurant()
    }
    buffer.toString.split("\r\n").head should be ("I am eating steak.")
  }

}
