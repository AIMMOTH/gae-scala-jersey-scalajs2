enablePlugins(ScalaJSPlugin)

name := "SBT for Scala.js build"

scalaVersion := "2.10.5" // or any other Scala version >= 2.10.2

val jsDir = "../gae/src/main/webapp"

crossTarget in (Compile, fastOptJS) := file(jsDir)

