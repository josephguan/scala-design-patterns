import sbt._
import Keys._

object Dependencies {

  val testDependencies: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )

}