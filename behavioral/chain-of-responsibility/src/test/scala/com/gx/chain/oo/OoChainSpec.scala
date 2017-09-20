package com.gx.chain.oo

import org.scalatest.{FlatSpec, Matchers}

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
class OoChainSpec extends FlatSpec with Matchers {

  it should "handle the requests" in {
    val company = new SoftwareCompany()

    val bug = FixBugRequest("a new bug")
    company.handleRequest(bug)
    bug.isHandled should be(true)

    val feature = FeatureRequest("a new feature")
    company.handleRequest(feature)
    feature.isHandled should be(true)

  }

  it should "not handle the request" in {
    val company = new SoftwareCompany()

    val fake = FakeRequest("just a kidding")
    company.handleRequest(fake)
    fake.isHandled should be(false)
  }


}
