package com.gx.builder

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

// Builder Interface
trait CarBuilder {
  def setEngine(engine: String): CarBuilder

  def setWheels(wheels: Int): CarBuilder

  def setColor(color: String): CarBuilder

  def build(): Car
}

// Concrete Builder
class DIYCarBuilder extends CarBuilder {
  private var engine = ""
  private var wheels = 0
  private var color = ""

  override def setEngine(engine: String): CarBuilder = {
    this.engine = engine
    this
  }

  override def setColor(color: String): CarBuilder = {
    this.color = color
    this
  }

  override def setWheels(wheels: Int): CarBuilder = {
    this.wheels = wheels
    this
  }

  override def build(): Car = {
    Car(engine, wheels, color)
  }
}


