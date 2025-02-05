import scala.collection.Seq
name := "coding-challenge-scala"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.13.16"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.19",
  "org.scalatest" %% "scalatest-wordspec" % "3.2.19",
  "org.scalacheck" %% "scalacheck" % "1.18.1"
).map(_ % Test)
