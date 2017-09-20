package com.gx.chain.fp

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
object RequestHandler {
  type Type = PartialFunction[Request, Response]

  // concrete Handler
  val developer: RequestHandler.Type = {
    case req@FixBugRequest(desc) =>
      println(s"I am a developer. I can fix this bug: $desc")
      Response(req, handled = true)
  }

  // concrete Handler
  val architect: RequestHandler.Type = {
    case req@FeatureRequest(desc) =>
      println(s"I am a architect. I can implement this feature: $desc")
      Response(req, handled = true)
  }

  // concrete Handler
  val CTO: RequestHandler.Type = {
    case req@ProductRequest(desc) =>
      println(s"I am a CTO. I can make this product: $desc")
      Response(req, handled = true)
  }

  // concrete Handler
  val noOne: RequestHandler.Type = {
    case req: Request =>
      println("No one is responsible for this request.")
      Response(req, handled = false)
  }


}
