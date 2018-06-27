package com.gx.monad

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

object App extends App {

  Validator("hello").validate(_.length > 6).flatMap(x => Valid(x.substring(6))) match {
    case Valid(s) => println(s)
    case Illegal => println("Illegal")
  }

  Validator("hello world").validate(_.length > 6).flatMap(x => Valid(x.substring(6).length)) match {
    case Valid(s) => println(s)
    case Illegal => println("Illegal")
  }

}
