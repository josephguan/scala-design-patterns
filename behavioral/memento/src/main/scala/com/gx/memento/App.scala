package com.gx.memento

import scala.collection.mutable

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

  val mementoStack = mutable.Stack[NotebookMemento]()
  val notebook = new Notebook

  notebook.write("I have a dream... ")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.write("I have a dream that one day ")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.write("black boys and black girls will be able to join hands ")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.write("with white boys and white girls as sisters and brothers.")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()

}
