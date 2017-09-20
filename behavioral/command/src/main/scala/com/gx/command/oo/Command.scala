package com.gx.command.oo

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
  * Interface for Command
  *
  */
trait Command {
  def execute(tv: Television): Unit

  def undo(): Unit

  def redo(): Unit
}

/**
  * SetChannelCommand is a concrete command
  */
class SetChannelCommand(channel: Int) extends Command {
  var targetTV: Television = _
  var preChannel: Int = -1

  override def execute(tv: Television): Unit = {
    targetTV = tv
    preChannel = tv.channel
    targetTV.channel = channel
  }

  override def redo(): Unit = {
    if (targetTV != null) {
      targetTV.channel = channel
    }
  }

  override def undo(): Unit = {
    if (targetTV != null) {
      targetTV.channel = preChannel
    }
  }
}

/**
  * SetVolumeCommand is a concrete command
  */
class SetVolumeCommand(volume: Int) extends Command {
  var targetTV: Television = _
  var preVolume: Int = -1

  override def execute(tv: Television): Unit = {
    targetTV = tv
    preVolume = tv.volume
    targetTV.volume = volume
  }

  override def redo(): Unit = {
    if (targetTV != null) {
      targetTV.volume = volume
    }
  }

  override def undo(): Unit = {
    if (targetTV != null) {
      targetTV.volume = preVolume
    }
  }
}

