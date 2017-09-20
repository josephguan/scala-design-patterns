package com.gx.chain.oo

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

/**
  * Handler Interface
  */
abstract class RequestHandler(next: RequestHandler) {

  def handleRequest(req: Request): Unit = {
    if (next != null) {
      next.handleRequest(req)
    } else {
      println("No one is responsible for this request.")
    }
  }

}

/**
  * Developer is a concrete handler
  */
class Developer(next: RequestHandler) extends RequestHandler(next) {

  override def handleRequest(req: Request): Unit = req match {
    case FixBugRequest(desc) =>
      println(s"I am a developer. I can fix this bug: $desc")
      req.markHandled()
    case _ =>
      super.handleRequest(req)
  }
}

/**
  * Architect is a concrete handler
  */
class Architect(next: RequestHandler) extends RequestHandler(next) {

  override def handleRequest(req: Request): Unit = req match {
    case FeatureRequest(desc) =>
      println(s"I am an architect. I can implement this feature: $desc")
      req.markHandled()
    case _ =>
      super.handleRequest(req)
  }
}

/**
  * CTO is a concrete handler
  */
class CTO(next: RequestHandler) extends RequestHandler(next) {

  override def handleRequest(req: Request): Unit = req match {
    case ProductRequest(desc) =>
      println(s"I am a CTO. I can make this product: $desc")
      req.markHandled()
    case _ =>
      super.handleRequest(req)
  }
}
