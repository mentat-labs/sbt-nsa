lazy val root = project in file(".") dependsOn(ProjectRef(file("../.."), "sbtNsa"))

scalacOptions += "-language:postfixOps"
