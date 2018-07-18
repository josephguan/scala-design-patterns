package com.gx.strategy.oo

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 josephguan
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
class OoStrategySpec extends FlatSpec with Matchers {

  it should "sort the array with quick sort algorithm " in {
    val sorter = new Sorter(new QuickSortStrategy)
    val sortedList = sorter.sort(List(5, 4, 3, 2, 1))
    sortedList should be(List(1, 2, 3, 4, 5))
  }

  it should "sort the array with bubble sort algorithm " in {
    val sorter = new Sorter(new BubbleSortStrategy)
    val sortedList = sorter.sort(List(5, 4, 3, 2, 1))
    sortedList should be(List(1, 2, 3, 4, 5))
  }

}
