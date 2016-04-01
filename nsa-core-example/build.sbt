enablePlugins(NsaPlugin)

crossScalaVersions := Seq(`2.11.8`, `2.10.6`)

nsaScalacOptions ++= Seq(
  `-deprecation`
, `-encoding` UTF-8
, `-feature`
, `-language` `_`
, `-unchecked`
, `-Xcheckinit`
, `-Xlint`
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
, `-Ywarn-nullary-unit`
, `-Ywarn-numeric-widen`
)
