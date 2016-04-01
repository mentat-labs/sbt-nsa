// enablePlugins(NsaPlugin)

//crossScalaVersions := Seq(`2.10.4`, `2.11.5`)

//scalaVersion := crossScalaVersions.value.head

//scalaVersion := "1.9.9"
//scalaVersion in Test := "2.0.0"
//scalaVersion in Compile := "2.1.0"

//
//name := "Superapp"
//
//name in Test := "Testapp"
//
//name in Runtime := "Runtimeapp"
//
//lazy val psk = taskKey[Unit]("Print Scoped Key")
//
//val pskSetting = psk := println("***** [APP NAME] " + name.value)
//
//// https://groups.google.com/d/msg/simple-build-tool/A87FFV4Sw4k/KPtygikQvogJ
//val myPsks = Seq(Compile, Test, Runtime) flatMap { conf =>
//  inConfig(conf)( Seq(pskSetting) )
//}
//
//myPsks
//
//scalacOptions ++= Seq(
//  "ccc"
//)
//
//scalacOptions in Test ++= Seq(
//  "ttt"
//)
//
//, scalacOptions ++= {
//  val nsv = nsaScalacVersion.value
//
//  nsaScalacOptions.value flatMap { _ match {
//    case so: ScalacOption if so isDefinedAt nsv => so.params
//    case so: ScalacOption => Nil
//    case x => x.params
//  }}
//}


//nsaScalacOptions ++= Seq(
//  `-deprecation`
//, `-encoding` UTF-8
//, `-feature`
//, `-language` implicitConversions
//, `-language` postfixOps
//, `-language` reflectiveCalls
//, `-optimise`
//, `-target` jvm-1.6
//, `-unchecked`
//, `-Xlint`
//, `-Xmax-classfile-name` `72`
//, `-Xno-forwarders`
//, `-Xstrict-inference`
//, `-Xverify`
//, `-Yclosure-elim`
//, `-Yconst-opt`
//, `-Ydead-code`
//, `-Yinline-warnings`
//, `-Yinline`
//, `-Yrepl-sync`
//, `-Ywarn-adapted-args`
//, `-Ywarn-dead-code`
//, `-Ywarn-inaccessible`
//, `-Ywarn-nullary-override`
//, `-Ywarn-nullary-unit`
//, `-Ywarn-numeric-widen`
//)

//nsaScalacOptions in Test := Seq(`-Yrangepos`)
