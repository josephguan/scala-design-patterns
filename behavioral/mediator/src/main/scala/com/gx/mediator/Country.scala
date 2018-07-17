package com.gx.mediator

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

abstract class Country(val name: String) {
  protected var organization: Organization = _

  def join(org: Organization): Unit = {
    organization = org
  }

  def declare(msg: String): Unit = {
    organization.countryDeclare(this, msg)
  }

  def receive(msg: String): Unit = {
    println(s"$name received: '$msg'")
  }
}

class USA extends Country("USA")

class China extends Country("China")

class Canada extends Country("Canada")


