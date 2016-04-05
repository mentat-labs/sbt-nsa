publishTo in ThisBuild := Some(if (isSnapshot.value) Opts.resolver.sonatypeSnapshots else Opts.resolver.sonatypeStaging)
publishMavenStyle in ThisBuild := true
pomIncludeRepository in ThisBuild := { _ => false }

pomExtra in ThisBuild :=
  <inceptionYear>2014</inceptionYear>
  <url>https://github.com/mentat-labs/sbt-nsa</url>
  <licenses>
    <license>
      <name>BSD 3-clause "New" or "Revised" License</name>
      <url>https://spdx.org/licenses/BSD-3-Clause</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:mentat-labs/sbt-nsa.git</url>
    <connection>scm:git:git@github.com:mentat-labs/sbt-nsa.git</connection>
  </scm>
  <developers>
    <developer>
      <id>melezov</id>
      <name>Marko Elezovi&#263;</name>
      <url>https://github.com/melezov</url>
    </developer>
  </developers>

scalacOptions in (Compile, doc) ++= Seq(
  "-no-link-warnings"
, "-sourcepath", baseDirectory.value.toString
, "-doc-source-url", s"""https://github.com/mentat-labs/sbt-nsa/blob/${version.value}\u20AC{FILE_PATH}.scala"""
)
