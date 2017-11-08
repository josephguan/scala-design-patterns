package com.gx.flyweight

import scala.collection.mutable

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

// Flyweight Factory
class TeaMaker {
  val teaPool = mutable.Map[Tea.Type, Tea]()

  def make(teaType: Tea.Type): Tea = {
    if (teaPool.isDefinedAt(teaType)) {
      teaPool.get(teaType).get
    }
    else {
      teaType match {
        case Tea.GreenTea =>
          val tea = new GreenTea
          teaPool.put(teaType, tea)
          tea
        case Tea.UnsharedTea =>
          new UnsharedTea()
      }
    }
  }

  def makeTeaInPool(teaType: Tea.Type, tea: Tea): Tea = {
    teaPool.put(teaType, tea)
    tea
  }
}
