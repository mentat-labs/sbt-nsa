No Strings Attached
===================

[![Build Status](https://travis-ci.org/mentat-labs/sbt-nsa.svg?branch=master)](https://travis-ci.org/mentat-labs/sbt-nsa)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.mentatlabs.nsa/sbt-nsa_2.10_0.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.mentatlabs.nsa/sbt-nsa_2.10_0.13)
[![Scaladoc](https://javadoc-badge.appspot.com/com.mentatlabs.nsa/sbt-nsa_2.10_0.13.svg?label=scaladoc)](http://javadoc-badge.appspot.com/com.mentatlabs.nsa/sbt-nsa_2.10_0.13)
[![License](https://img.shields.io/badge/license-BSD%203--clause-brightgreen.svg)](https://spdx.org/licenses/BSD-3-Clause)
[![Codacy](https://api.codacy.com/project/badge/grade/3b1c081128d64a1ba128e881d02424e5)](https://www.codacy.com/app/melezov/sbt-nsa)

Installation:

In `project/plugins.sbt`

    addSbtPlugin("com.mentatlabs.nsa" % "sbt-nsa" % "0.0.1")


Strongly typed Scala version (note the \`backticks\`):

    scala> `2.11.8`
    res0: com.mentatlabs.nsa.scalac.ScalacVersion = 2.11.8

    scala> res0.major
    res1: Int = 8

    scala> res0.minor
    res2: Int = 11

    scala> `2.9.1-1` > `2.9.1`
    res3: Boolean = true

Strongly typed Scalac options:

    scala> `-target` `jvm-1.8`
    res0: com.mentatlabs.nsa.scalac.ScalacOptionChoice[String] = -target:jvm-1.8

    scala> `-Xfatal-warnings`
    res1: com.mentatlabs.nsa.scalac.options.ScalacXFatalWarnings.type = -Xfatal-warnings

    scala> `-encoding` `UTF-8`
    res2: com.mentatlabs.nsa.NsaPlugin.autoImport.-encoding.CompilerOptionType = -encoding UTF-8

Experimental DSL is also available :

    scala> import nsaExperimentalDsl._
    import nsaExperimentalDsl._

    scala> -target jvm-1.8
    res0: com.mentatlabs.nsa.scalac.ScalacOptionChoice[String] = -target:jvm-1.8

    scala> -Xfatal-warnings
    res1: com.mentatlabs.nsa.scalac.options.ScalacXFatalWarnings.type = -Xfatal-warnings

    scala> -encoding UTF-8
    res2: com.mentatlabs.nsa.NsaPlugin.autoImport.nsaExperimentalDsl.encoding.unary_-.CompilerOptionType = -encoding UTF-8

Usage in `build.sbt`:

    enablePlugins(NsaPlugin)

    scalaVersion := `2.10.6`

    nsaScalacOptions ++= Seq(
      `-deprecation`
    , `-encoding` `UTF-8`
    , `-feature`
    , `-language` `_`
    , `-optimise`
    , `-unchecked`
    , `-Xcheckinit`
    , `-Xfatal-warnings`
    , `-Xlint`
    , `-Xno-forwarders`
    , `-Xno-uescape`
    , `-Xstrict-inference`
    , `-Xverify`
    , `-Yclosure-elim`
    , `-Ydead-code`
    , `-Yinline-warnings`
    , `-Yinline`
    , `-Yrepl-sync`
    , `-Ywarn-adapted-args`
    , `-Ywarn-dead-code`
    , `-Ywarn-inaccessible`
    , `-Ywarn-nullary-override`
    , `-Ywarn-nullary-unit`
    , `-Ywarn-numeric-widen`
    )

Usage of experimental DSL in `build.sbt`:

    enablePlugins(NsaPlugin)
    import nsaExperimentalDsl._

    scalaVersion := `2.10.6`

    nsaScalacOptions ++= Seq(
      -deprecation
    , -encoding UTF-8
    , -feature
    , -language `_`
    , -optimise
    , -unchecked
    , -Xcheckinit
    , -Xfatal-warnings
    , -Xlint
    , -Xno-forwarders
    , -Xno-uescape
    , -Xstrict-inference
    , -Xverify
    , -Yclosure-elim
    , -Ydead-code
    , -Yinline-warnings
    , -Yinline
    , -Yrepl-sync
    , -Ywarn-adapted-args
    , -Ywarn-dead-code
    , -Ywarn-inaccessible
    , -Ywarn-nullary_override
    , -Ywarn-nullary-unit
    , -Ywarn-numeric-widen
    )

NO STRINGLY-TYPED CONFIGURATION
-------------------------------

Usually, when cross-building, you need to manually track settings of each scalac version:

    def scalac2_12Options = Seq(...)
    def scalac2_11Options = Seq(...)
    def scalac2_10Options = Seq(...)

    scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, major)) if major >= 12 =>
        scalac2_10Options ++ scalac2_11Options ++ scalac2_12Options
      case Some((2, major)) if major == 11 =>
        scalac2_10Options ++ scalac2_11Options
      case _ =>
        scalac2_10Options
    })


`nsaScalacOptions` understands the capabilities of each Scalac, and will hide unsupported compiler options:

    > ++2.11.8
    [info] Setting version to 2.11.8
    [info] Reapplying settings...
    [info] Set current project to sbt-nsa (in build file:/code/sbt-nsa/)
    > show scalacOptions
    [info] List(-deprecation, -encoding, UTF-8, -feature, -language:_, -optimise, -unchecked, -Xcheckinit, -Xfatal-warnings, -Xlint, -Xno-forwarders, -Xno-uescape, -Xstrict-inference, -Xverify, -Yclosure-elim, -Ydead-code, -Yinline-warnings, -Yinline, -Yrepl-sync, -Ywarn-adapted-args, -Ywarn-dead-code, -Ywarn-inaccessible, -Ywarn-nullary-override, -Ywarn-nullary-unit, -Ywarn-numeric-widen)
    [success] Total time: 0 s, completed 05.04.2016. 12:29:58
    > ++2.8.0
    [info] Setting version to 2.8.0
    [info] Reapplying settings...
    [info] Set current project to sbt-nsa (in build file:/code/sbt-nsa/)
    > show scalacOptions
    [info] List(-deprecation, -encoding, UTF-8, -optimise, -unchecked, -Xcheckinit, -Xfatal-warnings, -Xno-forwarders, -Xno-uescape, -Yclosure-elim, -Ydead-code, -Yinline, -Ywarn-dead-code)
    [success] Total time: 0 s, completed 05.04.2016. 12:30:01
    > ++2.0.0
    [info] Setting version to 2.0.0
    [info] Reapplying settings...
    [info] Set current project to sbt-nsa (in build file:/code/sbt-nsa/)
    > show scalacOptions
    [info] List(-encoding, UTF-8)
    [success] Total time: 0 s, completed 05.04.2016. 12:30:03

Coming soon to your local SBT project:
--------------------------------------
+ Common use-case libraries
+ Standardized licences ([https://spdx.org/](https://spdx.org/))
