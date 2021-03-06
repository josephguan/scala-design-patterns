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
object App extends App {

  val v = new Virus("HIV", "BAD")
  println(v == v.clone())

  val b = Bacteria("LAB", "GOOD")
  println(b == b.copy())

  //  val hero = new Hero("Joe")
  //  hero.gender = Gender("male")
  //  hero.weapon = new Weapon("gun")
  //
  //  val hero2 = hero.clone()
  //
  //  hero.weapon.name = "knife"
  //  hero2.gender = Gender("female")
  //
  //  println(hero.gender)
  //  println(hero2.weapon.name)
}
