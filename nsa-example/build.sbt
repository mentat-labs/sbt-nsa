enablePlugins(NsaPlugin)

scalaVersion := `2.11.5`

crossScalaVersions := Seq(`2.10.4`, `2.11.5`)

nsaScalacOptions ++= Seq(
  `-deprecation`
, `-encoding` UTF-8
, `-feature`
, `-language` existentials
, `-language` implicitConversions
, `-language` postfixOps
, `-language` reflectiveCalls
, `-optimise`
, `-unchecked`
, `-Xcheckinit`
, `-Xlint`
, `-Xmax-classfile-name` `72`
, `-Xno-forwarders`
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
