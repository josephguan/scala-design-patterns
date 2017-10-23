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
class TeaShop {
  private val orders = mutable.LinkedHashMap[Int, Tea]()
  private val maker = new TeaMaker()

  def takeOrder(teaType: Tea.Type, table: Int): Unit = {
    orders.put(table, maker.make(teaType))
  }

  def serve(): Unit = {
    orders.foreach {
      case (table, tea) => tea.serve(table)
    }
  }
}
