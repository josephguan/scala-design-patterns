package com.gx.visitor.fp

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
object AnimalOperation {
  def speak(animal: Animal): Unit = animal match {
    case monkey: Monkey => println("Ooh oo aa aa!")
    case lion: Lion => println("Roaaar!")
    case dolphin: Dolphin => println("Tuut tuttu tuutt!")
    case _ => // do nothing
  }

  def swim(animal: Animal): Unit = animal match {
    case dolphin: Dolphin => println("Dolphin swim fast!")
    case _ => // do nothing
  }
}
