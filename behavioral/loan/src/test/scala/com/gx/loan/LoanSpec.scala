package com.gx.loan

import java.io.ByteArrayOutputStream

import org.scalatest.{FlatSpec, Matchers}

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
class LoanSpec extends FlatSpec with Matchers {

  it should "close the resource after using it" in {
    using(new ByteArrayOutputStream()) { buffer =>

      Console.withOut(buffer) {
        using(new FakeFile()) { file =>
          file.content should be("This is a Fake File.")
        }
      }

      buffer.toString should be("closing fake file.\r\n")
    }
  }


}
