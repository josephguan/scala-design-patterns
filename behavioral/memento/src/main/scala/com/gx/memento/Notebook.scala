package com.gx.memento

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
class Notebook {
  private var content = new StringBuffer()

  def getMemento: NotebookMemento = {
    NotebookMementoInternal(content.toString)
  }

  def setMemento(memento: NotebookMemento): Unit = {
    val state = memento.asInstanceOf[NotebookMementoInternal]
    content = new StringBuffer(state.content)
  }

  def write(words: String): Unit = {
    content.append(words)
  }

  def show(): Unit = {
    println(content)
  }

  case class NotebookMementoInternal(content: String) extends NotebookMemento


}
