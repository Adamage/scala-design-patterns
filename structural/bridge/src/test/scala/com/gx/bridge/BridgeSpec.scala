package com.gx.bridge

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
class BridgeSpec extends FlatSpec with Matchers {

  it should "creates about-page with different theme" in {
    new AboutPage(new DarkTheme).getContent should be("About page in Dark Black")
    new AboutPage(new LightTheme).getContent should be("About page in Off White")
  }

  it should "change help-page's theme" in {
    val help = new HelpPage(new DarkTheme)
    help.getContent should be("Help page in Dark Black")
    help.changeTheme(new LightTheme)
    help.getContent should be("Help page in Off White")
  }
}
