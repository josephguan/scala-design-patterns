package com.gx.composite

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
trait Action {
  def act(): Unit
}

class TurnRight extends Action {
  override def act(): Unit = println("turn right")
}

class TurnLeft extends Action {
  override def act(): Unit = println("turn left")
}

class Forward extends Action {
  override def act(): Unit = println("go forward")
}

class CompositeAction(actions: Action*) extends Action {
  override def act(): Unit = {
    actions.foreach(a => a.act())
  }
}
