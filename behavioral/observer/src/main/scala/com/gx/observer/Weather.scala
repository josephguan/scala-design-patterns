package com.gx.observer

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
class Weather {
  val observers = mutable.ListBuffer[WeatherObserver]()
  var currentWeather: WeatherType = WeatherType.SUNNY

  def addObserver(ob: WeatherObserver): Unit = {
    observers.append(ob)
  }

  def removeObserver(ob: WeatherObserver): Unit = {
    val index = observers.indexOf(ob)
    if (index != -1) {
      observers.remove(index)
    }
  }

  def changing(weather: WeatherType): Unit = {
    currentWeather = weather
    notifyObservers()
  }

  def notifyObservers(): Unit = {
    observers.foreach { ob =>
      ob.update(currentWeather)
    }
  }

}


