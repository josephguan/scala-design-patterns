package com.gx.visitor.oo

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

// Visitor
trait AnimalOperation {
  def visitMonkey(monkey: Monkey): Unit = {
    // do nothing
  }

  def visitLion(lion: Lion): Unit = {
    // do nothing
  }

  def visitDolphin(dolphin: Dolphin): Unit = {
    // do nothing
  }
}

class Speak extends AnimalOperation {
  override def visitMonkey(monkey: Monkey): Unit = println("Ooh oo aa aa!")

  override def visitLion(lion: Lion): Unit = println("Roaaar!")

  override def visitDolphin(dolphin: Dolphin): Unit = println("Tuut tuttu tuutt!")
}


class Swim extends AnimalOperation {
  override def visitDolphin(dolphin: Dolphin): Unit = println("Dolphin swim fast!")
}