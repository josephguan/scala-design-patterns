package com.gx.decorator

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
trait Coffee {
  def getCost: Int

  def getDescription: String
}

class SimpleCoffee extends Coffee {
  override def getCost: Int = 10

  override def getDescription: String = "Simple coffee "
}

//Decorator
trait MilkAdded extends Coffee {
  abstract override def getCost: Int = super.getCost + 5

  abstract override def getDescription: String = super.getDescription + "with milk "
}

//Decorator
trait SugarAdded extends Coffee {
  abstract override def getCost: Int = super.getCost + 3

  abstract override def getDescription: String = super.getDescription + "with sugar "
}
