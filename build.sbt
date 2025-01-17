name := "airbnb"

version := "0.1"

scalaVersion := "2.12.10"
val AkkaVersion = "2.6.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.5"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.12" % "2.4.5"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.5"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.5"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.5"
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.9"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % Test
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test

val sprayGroup = "io.spray"
val sprayJsonVersion = "1.3.5"
libraryDependencies ++= List("spray-json") map {c => sprayGroup %% c % sprayJsonVersion}
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka" % "2.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.11",
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion
)