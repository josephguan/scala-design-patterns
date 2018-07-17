package com.gx.memento

import java.io.ByteArrayOutputStream

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

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
class MementoSpec extends FlatSpec with Matchers {

  it should "undo the last typing" in  {
    val notebook = new Notebook
    notebook.write("Hello World!")

    val memento = notebook.getMemento
    notebook.write("I want to undo these words...")
    notebook.setMemento(memento)

    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      notebook.show()
    }
    buffer.toString() should be ("Hello World!\r\n")
  }
}
