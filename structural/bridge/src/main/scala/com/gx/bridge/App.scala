package com.gx.bridge

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

  val about = new AboutPage(new DarkTheme)
  println(about.getContent)

  val help = new HelpPage(new LightTheme)
  println(help.getContent)

  help.changeTheme(new DarkTheme)
  println(help.getContent)

}
