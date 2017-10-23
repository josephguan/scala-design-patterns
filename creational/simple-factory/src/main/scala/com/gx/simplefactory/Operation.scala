package com.gx.simplefactory

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

// Product Interface
trait Operation {
  def getResult(a: Double, b: Double): Double
}

// Concrete Product
class AddOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    a + b
  }
}

// Concrete Product
class SubOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    a - b
  }
}

// Concrete Product
class MulOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    a * b
  }
}

// Concrete Product
class DivOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    if (b == 0) throw new Exception("b can not be zero")
    a / b
  }
}

// Simple Factory Method
// also known as: companion object apply method
object Operation {
  def apply(op: String) = op match {
    case "+" => new AddOperation()
    case "-" => new SubOperation()
    case "*" => new MulOperation()
    case "/" => new DivOperation();
  }
}

