import sbt._
import Keys._
import scala.collection.mutable.ArrayBuffer

object Builds extends Build {

  val modules = ArrayBuffer[Project]()

  //----------------------------------------
  // modules
  //----------------------------------------

  val `command` = project.in(file("behavioral/command")).settings(name := "command").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `command`

  val `chain-of-responsibility` = project.in(file("behavioral/chain-of-responsibility")).settings(name := "chain-of-responsibility").
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.testDependencies)
  modules += `chain-of-responsibility`


  //----------------------------------------------------------------
  // all in one
  //----------------------------------------------------------------
  lazy val all = (project in file(".")).settings(name := "all").
    settings(Common.settings: _*).
    aggregate(modules.map(Project.projectToRef): _*)

}
