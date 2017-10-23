package com.gx.strategy.oo

import scala.math.Ordering

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
trait SortStrategy {
  def sort[T](dataset: List[T])(implicit ord: Ordering[T]): List[T]
}

class BubbleSortStrategy extends SortStrategy {
  override def sort[T](dataset: List[T])(implicit ord: Ordering[T]): List[T] = {
    println("sorting using bubble sort")
    dataset.sorted
  }
}

class QuickSortStrategy extends SortStrategy {
  override def sort[T](dataset: List[T])(implicit ord: Ordering[T]): List[T] = {
    println("sorting using quick sort")
    dataset.sorted
  }

}
