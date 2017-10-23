package com.gx.prototype

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

trait Prototype extends Cloneable {
  override def clone(): AnyRef = super.clone()
}

class Virus(var name: String, var character: String) extends Prototype {
  override def clone(): Virus = new Virus(name, character)
}

// scala case class is a kind of prototype
case class Bacteria(name:String, character: String)

/* this is too complicated
class Hero(name: String) extends Prototype {
  var gender: Gender = _
  var weapon: Weapon = _

  override def clone(): Hero = {
    val hero = new Hero(name)
    hero.gender = gender.copy()
    hero.weapon = weapon.clone()
    hero
  }
}

class Weapon(var name: String) extends Prototype {

  override def clone(): Weapon = {
    val weapon = new Weapon(name)
    weapon
  }
}

case class Gender(gender: String)

*/