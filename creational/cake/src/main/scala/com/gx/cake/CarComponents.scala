package com.gx.cake

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

//-------------------
// Engine Component
//-------------------
trait EngineComponent {
  val engine: Engine

  trait Engine {
    def start(): Unit
  }

  class V6Engine extends Engine {
    override def start(): Unit = println("Vroom Vroom Vroom... V6 Engine started.")
  }

  class V8Engine extends Engine {
    override def start(): Unit = println("Vroom Vroom Vroom... V8 Engine started.")
  }

}

//-------------------
// Wheel Component
//-------------------
trait WheelComponent {
  val wheel: Wheel

  trait Wheel {
    def rotate(): Unit
  }

  class MichelinWheel extends Wheel {
    override def rotate(): Unit = println("Michelin wheel rotated.")
  }

  class DunlopWheel extends Wheel {
    override def rotate(): Unit = println("Dunlop wheel rotated.")
  }

}

//-------------------
// Brand Component
//-------------------
trait BrandComponent {

  val brand: Brand

  trait Brand {
    def light(): Unit
  }

  class AudiBrand extends Brand {
    override def light(): Unit = println("I am Audi.")
  }

  class BMWBrand extends Brand {
    override def light(): Unit = println("I am BMW.")
  }

}


