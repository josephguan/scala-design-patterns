package com.gx.observer

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
trait WeatherObserver {
  def update(currentWeather: WeatherType)
}

class Boy extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("It is sunny. I can go to play football.")
    case WeatherType.RAINY => println("It is rainy. I can play video games at home.")
    case WeatherType.COLD => println("It is cold. It is a nice for sleeping.")
  }
}

class Girl extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("It is sunny. I can go shopping.")
    case WeatherType.RAINY => println("It is rainy. I should take an umbrella and go shopping.")
    case WeatherType.COLD => println("It is cold. I should go to buy some clothes.")
  }
}