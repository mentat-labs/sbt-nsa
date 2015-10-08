enablePlugins(NsaPlugin)

scalaVersion := `2.11.5`

nsaScalacOptions ++= Seq(
  -deprecation
, -encoding UTF-8
, -feature
, -language (implicitConversions,postfixOps)
, -unchecked
, -Xcheckinit
, -Xlint
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
