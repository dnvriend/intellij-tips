name := "intellij-tips"

organization := "com.github.dnvriend"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.14"

//scalaOrganization in ThisBuild := "org.typelevel"

//scalacOptions in ThisBuild += "-Yliteral-types"

// functional and typelevel programming
// https://github.com/scalaz/scalaz
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.3.5"
// https://github.com/mpilquist/simulacrum
libraryDependencies += "com.github.mpilquist" %% "simulacrum" % "0.19.0"
// https://github.com/milessabin/shapeless
//libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.2"
// https://github.com/typelevel/cats
//libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"

// compile-time DI (only used at compile-time so in "provided" scope)
// https://github.com/adamw/macwire
libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.4.0" % "provided"

// testing
// https://github.com/typelevel/scalaz-scalatest
libraryDependencies += "org.typelevel" %% "scalaz-scalatest" % "1.1.2" % Test
// https://www.playframework.com/documentation/2.5.x/ScalaTestingWithScalaTest#Mockito  
//libraryDependencies += "org.mockito" % "mockito-core" % "2.2.21" % Test
// http://scalamock.org/
// https://github.com/paulbutcher/ScalaMock
libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % Test
// http://www.scalatest.org/
// https://github.com/scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1"

// testing configuration
Test / fork := true
parallelExecution := false

//licenses +=("Apache-2.0", url("http://opensource.org/licenses/apache2.0.php"))

// enable scala code formatting //
//import scalariform.formatter.preferences._
//import com.typesafe.sbt.SbtScalariform

// Scalariform settings
//SbtScalariform.autoImport.scalariformPreferences := SbtScalariform.autoImport.scalariformPreferences.value
//  .setPreference(AlignSingleLineCaseStatements, true)
//  .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
//  .setPreference(DoubleIndentClassDeclaration, true)

// enable updating file headers //
//import de.heikoseeberger.sbtheader.license.Apache2_0

//headers := Map(
//  "scala" -> Apache2_0("2017", "Dennis Vriend"),
//  "conf" -> Apache2_0("2017", "Dennis Vriend", "#")
//)

// 
// compiler plugins
//

// https://github.com/scalamacros/paradise
// http://docs.scala-lang.org/overviews/macros/paradise.html
//addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
// https://github.com/non/kind-projector
//addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

//enablePlugins(AutomateHeaderPlugin, SbtScalariform)
