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
