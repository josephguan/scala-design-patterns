package com.gx.monad

import scala.collection.mutable.ListBuffer

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

// Monad
abstract class Validator[+A] {

  protected val isValid: Boolean

  def get: A

  def validate(p: A => Boolean): Validator[A] = {
    if (!isValid) Illegal
    else if (!p(this.get)) Illegal
    else this
  }

  def flatMap[B](f: A => Validator[B]): Validator[B] = {
    if (isValid) f(this.get) else Illegal
  }

}


object Validator {
  def apply[A](testee: A): Validator[A] = new Valid[A](testee)
}


case class Valid[+A](testee: A) extends Validator[A] {
  override protected val isValid: Boolean = true
  override def get: A = testee
}


case object Illegal extends Validator[Nothing] {
  override protected val isValid: Boolean = false
  override def get = throw new IllegalStateException()
}