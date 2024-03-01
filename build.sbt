lazy val root =
  project
    .in(file("."))
    .settings( scalaVersion := "3.3.0"
             , name         := "nmcb-automation"
             , version      := "0.1.0"
             , libraryDependencies ++= Seq(
               "org.scalatest"    %% "scalatest"  % "3.2.18" % "test"
             ))

scalacOptions ++= Seq(       
  "-encoding", "utf8",        
  "-feature",                 
  "-language:implicitConversions",
  "-language:existentials",
  "-unchecked",
  "-Werror",
  "-deprecation"
)

Compile / run / fork := true
Compile / run / javaOptions ++= Seq("-Xmx8G", "-Xss1G", "-XX:+UseG1GC")

Test / fork := true
Test / javaOptions ++= Seq("-Xmx8G", "-Xss1G", "-XX:+UseG1GC")
