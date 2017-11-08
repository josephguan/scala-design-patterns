package com.gx.flyweight

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

// Flyweight Interface
trait Tea {
  // name is intrinsic state, shared state
  val name: String

  // table is extrinsic state, unshared state
  def serve(table: Int): Unit = {
    println(s"Serving $name to table# $table. hashCode: $hashCode")
  }
}

// concrete flyweight
class GreenTea extends Tea {
  override val name: String = "Green Tea"
}

// unshared concrete flyweight
class UnsharedTea extends Tea {
  override val name: String = "Unshared Tea"

  // unshared state
  val price = 10

  override def serve(table: Int): Unit = {
    println(s"Serving $name to table# $table. Price is $price. hashCode: $hashCode")
  }
}

// Tea type
object Tea {

  trait Type

  case object GreenTea extends Type

  case object UnsharedTea extends Type

}

// This is what Tea will look like if it is not a Flyweight
//trait Tea {
//  val name: String
//  val table: Int  // create a object for each table
//  def serve(): Unit
//}