package com.mentatlabs.nsa

import sbt._
import Keys._

object NsaPlugin extends AutoPlugin {
  import scalac._

  object autoImport
      extends ScalacVersions
      with dsl.ScalacOptionsDSL {

    lazy val scalaVersionCopy = SettingKey[String]("scala-version-copy", "Copy of scala version")

    // lazy val nsaScalacVersion = SettingKey[ScalacVersion]("nsa-scalac-version", "Strongly typed version of Scalac derived from stringly typed scalaVersion")

//    lazy val nsaScalacVersion = TaskKey[Option[ScalacVersion]]("nsa-scalac-version", "Strongly typed version of Scalac derived from stringly typed scalaVersion")

    //    lazy val setSV = taskKey[Unit]("Parse scala version")

    //    lazy val nsaScalacOptions = SettingKey[Seq[CompilerOption]]("nsa-scalac-options", "Typed options for the Scala compiler.")

    //    // https://groups.google.com/d/msg/simple-build-tool/A87FFV4Sw4k/KPtygikQvogJ
    //    val myPsks = Seq(Compile, Test, Runtime) flatMap { conf =>
    //      inConfig(conf)( Seq(pskSetting) )
    //    }
    //
    //    myPsks
    //

    implicit def PimpedScalacVersion(scalacVersion: scalac.ScalacVersion) =
      scalacVersion.toString

    implicit def PimpedScalacVersionSeq(scalacVersions: Seq[scalac.ScalacVersion]) =
      scalacVersions.map(_.toString)
  }

//
//    protected implicit def PimpString(s: String) =
//      new CompilerOption {
//        def params = Seq(s)
//      }
//
//    protected implicit def PimpProduct(p: Product) =
//      new CompilerOption {
//        def params = p.productIterator.map(_.toString).toSeq
//      }
//
//    trait ScalacOptions
//        extends dsl.ScalacOptionsExperimentalDSL
//        with Seq[CompilerOption] {
//      def options: Seq[CompilerOption]
//      def length = options.length
//      def apply(idx: Int) = options(idx)
//      def iterator = options.iterator
//    }
//  }
//
  import autoImport._
//
// settings(myPsks: _*)
//
  override lazy val projectSettings =
    (Seq(Compile, Test) flatMap { c =>
      inConfig(c) { Seq(
        scalaVersionCopy := scalaVersion.value
      )
      }
    })

//    nsaScalacVersion := ScalacVersion(scalaVersion.value)
//  , nsaScalacVersion := ScalacVersion(scalaVersion.value)
//  , nsaScalacVersion := ScalacVersion(scalaVersion.value)
//  , nsaScalacVersion := ScalacVersion(scalaVersion.value)
//  )
      //      val sv = scalaVersion.value
//      .getOrElse(sys.error("Could not determine Scalac version from: " + sv))
//  )


//    Seq(Compile, Test) map { c =>
//      inConfig(c) {
//        val sv = scalaVersion.value
//        ScalacVersion(sv).getOrElse(sys.error("Could not determine Scalac version from: " + sv))
//      }
//    }
//
//  lazy val setSVSetting =
//    nsaScalacVersion := {
//      val sv = scalaVersion.value
//      ScalacVersion(sv).getOrElse(sys.error("Could not determine Scalac version from: " + sv))
//    }
//
//  nsaScalacOptions := Nil
//
//  , scalacOptions ++= {
//      val nsv = nsaScalacVersion.value
//
//      nsaScalacOptions.value flatMap { _ match {
//        case so: ScalacOption if so isDefinedAt nsv => so.params
//        case so: ScalacOption => Nil
//        case x => x.params
//      }}
//    }

}
