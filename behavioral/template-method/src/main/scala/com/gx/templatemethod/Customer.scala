package com.gx.templatemethod

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
abstract class Customer {

  def goToRestaurant(): Unit = {
    val orders = order()
    println(s"I am eating $orders.")
    println(s"The $orders is ${comments()}")
  }

  protected def order(): String

  protected def comments(): String

}

class Vegan extends Customer {
  override protected def order(): String = "vegetable"

  override protected def comments(): String = "yummy"
}

class MeatLover extends Customer {
  override protected def order(): String = "steak"

  override protected def comments(): String = "yummy"
}