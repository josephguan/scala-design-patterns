package com.gx.factorymethod

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

// Client
trait Chef {
  def makeNoodle(): Noodle

  def cook(): Unit = {
    val noodle = makeNoodle()
    println(s"The noodle is ${noodle.flavor()}. Yummy!")
  }
}

class ThaiChef extends Chef {
  override def makeNoodle(): Noodle = new PadThai()
}

class ItalianChef extends Chef {
  override def makeNoodle(): Noodle = new Spaghetti()
}
