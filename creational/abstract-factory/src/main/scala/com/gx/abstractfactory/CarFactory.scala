package com.gx.abstractfactory

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
trait CarFactory {
  def createEngine(): Engine

  def createWheel(): Wheel

  def createBrand(): Brand
}

object AudiCarFactory extends CarFactory {
  override def createEngine(): Engine = new V6Engine()

  override def createWheel(): Wheel = new DunlopWheel()

  override def createBrand(): Brand = new AudiBrand
}

object BMWCarFactory extends CarFactory {
  override def createEngine(): Engine = new V8Engine()

  override def createWheel(): Wheel = new MichelinWheel()

  override def createBrand(): Brand = new BMWBrand
}