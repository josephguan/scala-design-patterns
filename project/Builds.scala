import sbt._
import Keys._
import scala.collection.mutable.ArrayBuffer

object Builds extends Build {

  val modules = ArrayBuffer[Project]()

  //----------------------------
  // behavioral patterns
  //----------------------------
  lazy val `command` = project.in(file("behavioral/command")).settings(name := "command").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `command`

  lazy val `chain-of-responsibility` = project.in(file("behavioral/chain-of-responsibility")).settings(name := "chain-of-responsibility").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `chain-of-responsibility`

  lazy val `state` = project.in(file("behavioral/state")).settings(name := "state").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `state`

  lazy val `strategy` = project.in(file("behavioral/strategy")).settings(name := "strategy").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `strategy`

  lazy val `observer` = project.in(file("behavioral/observer")).settings(name := "observer").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `observer`

  lazy val `template-method` = project.in(file("behavioral/template-method")).settings(name := "template-method").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `template-method`

  lazy val `visitor` = project.in(file("behavioral/visitor")).settings(name := "visitor").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `visitor`

  lazy val `mediator` = project.in(file("behavioral/mediator")).settings(name := "mediator").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `mediator`

  lazy val `memento` = project.in(file("behavioral/memento")).settings(name := "memento").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `memento`

  lazy val `loan` = project.in(file("behavioral/loan")).settings(name := "loan").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `loan`


  //----------------------------
  // creational patterns
  //----------------------------
  lazy val `abstract-factory` = project.in(file("creational/abstract-factory")).settings(name := "abstract-factory").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `abstract-factory`

  lazy val `cake` = project.in(file("creational/cake")).settings(name := "cake").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `cake`

  lazy val `factory-method` = project.in(file("creational/factory-method")).settings(name := "factory-method").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `factory-method`

  lazy val `simple-factory` = project.in(file("creational/simple-factory")).settings(name := "simple-factory").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `simple-factory`

  lazy val `singleton` = project.in(file("creational/singleton")).settings(name := "singleton").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `singleton`

  lazy val `builder` = project.in(file("creational/builder")).settings(name := "builder").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `builder`

  lazy val `prototype` = project.in(file("creational/prototype")).settings(name := "prototype").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `prototype`

  lazy val `factory-kit` = project.in(file("creational/factory-kit")).settings(name := "factory-kit").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `factory-kit`

  lazy val `value-object` = project.in(file("creational/value-object")).settings(name := "value-object").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `value-object`

  //----------------------------
  // structural patterns
  //----------------------------
  lazy val `adapter` = project.in(file("structural/adapter")).settings(name := "adapter").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `adapter`

  lazy val `bridge` = project.in(file("structural/bridge")).settings(name := "bridge").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `bridge`

  lazy val `composite` = project.in(file("structural/composite")).settings(name := "composite").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `composite`

  lazy val `decorator` = project.in(file("structural/decorator")).settings(name := "decorator").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `decorator`

  lazy val `facade` = project.in(file("structural/facade")).settings(name := "facade").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `facade`

  lazy val `flyweight` = project.in(file("structural/flyweight")).settings(name := "flyweight").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `flyweight`

  lazy val `proxy` = project.in(file("structural/proxy")).settings(name := "proxy").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `proxy`

  lazy val `magnet` = project.in(file("structural/magnet")).settings(name := "magnet").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `magnet`

  lazy val `type-classes` = project.in(file("structural/type-classes")).settings(name := "type-classes").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `type-classes`


  //----------------------------
  // other patterns
  //----------------------------
  lazy val `selfless-trait` = project.in(file("other/selfless-trait")).settings(name := "selfless-trait").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `selfless-trait`

  lazy val `monad` = project.in(file("other/monad")).settings(name := "monad").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `monad`

  //----------------------------------------
  // all in one
  //----------------------------------------
  lazy val all = (project in file(".")).settings(name := "all").
    settings(Common.settings: _*).
    aggregate(modules.map(Project.projectToRef): _*)

}
