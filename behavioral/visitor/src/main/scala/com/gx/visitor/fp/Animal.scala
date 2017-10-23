package com.gx.visitor.fp

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
// Visitee
trait Animal {
  def accept(operation: Animal.Operation)
}

class Monkey extends Animal {
  override def accept(operation: Animal.Operation): Unit = {
    operation(this)
  }
}

class Lion extends Animal {
  override def accept(operation: Animal.Operation): Unit = {
    operation(this)
  }
}

class Dolphin extends Animal {
  override def accept(operation: Animal.Operation): Unit = {
    operation(this)
  }
}

// Type of Visitor
object Animal {
  type Operation = Animal => Unit
}