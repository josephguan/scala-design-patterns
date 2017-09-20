package com.gx.command.fp

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
  * All commands are here.
  *
  */
object Command {
  // In functional programing, the command is actually a function.
  type Type = (Television) => Television

  // a concrete command for setting channel
  def setChannel(channel: Int)(tv: Television): Television = {
    Television(channel, tv.volume)
  }

  // a concrete command for setting volume
  def setVolume(volume: Int)(tv: Television): Television = {
    Television(tv.channel, volume)
  }

}
