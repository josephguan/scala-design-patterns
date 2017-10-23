package com.gx.magnet

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
class Doubling {
  def double(magnet: DoubleMagnet): magnet.Result = magnet()

  // overloading collisions caused by type erasure
  //  def notWork(ls: List[Int]): List[Int] = ls.map(_ * 2)
  //  def notWork(ls: List[String]): List[String] = ls ++ ls
}

// Magnet Interface
trait DoubleMagnet {
  type Result

  def apply(): Result
}

// Implicit Conversions
object DoubleMagnet {
  implicit def fromInt(x: Int): DoubleMagnet = new DoubleMagnet {
    override type Result = Int

    override def apply(): Result = x * 2
  }

  implicit def fromListInt(ls: List[Int]): DoubleMagnet = new DoubleMagnet {
    override type Result = List[Int]

    override def apply(): Result = ls.map(_ * 2)
  }

  implicit def fromListString(ls: List[String]): DoubleMagnet = new DoubleMagnet {
    override type Result = List[String]

    override def apply(): Result = ls ++ ls
  }

  // overloading with different number of parameters
  implicit def fromStringIntTuple(para: Tuple2[String, Int]): DoubleMagnet = new DoubleMagnet {
    override type Result = String

    override def apply(): String = para._1 * para._2
  }
}
