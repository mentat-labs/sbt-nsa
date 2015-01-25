package com.mentatlabs.nsa
package scalac
package dsl

class ScalacOptionsDSLAdvancedSpec extends ScalacOptionsDSLSpec {
  def is = s2"""
  -Xcheckinit                  ${`-Xcheckinit test`}
  -Xdev                        ${`-Xdev test`}
  -Xdisable-assertions         ${`-Xdisable-assertions test`}
  -Xelide-below                ${`-Xelide-below test`}
  -Xexperimental               ${`-Xexperimental test`}
  -Xfatal-warnings             ${`-Xfatal-warnings test`}
  -Xfull-lubs                  ${`-Xfull-lubs test`}
  -Xfuture                     ${`-Xfuture test`}
  -Yinfer-argument-types       ${`-Yinfer-argument-types test`}
  -Xlint                       ${`-Xlint test`}
  -Xlog-free-terms             ${`-Xlog-free-terms test`}
  -Xlog-free-types             ${`-Xlog-free-types test`}
  -Xlog-implicit-conversions   ${`-Xlog-implicit-conversions test`}
  -Xlog-implicits              ${`-Xlog-implicits test`}
  -Xlog-reflective-calls       ${`-Xlog-reflective-calls test`}
  -Xmax-classfile-name         ${`-Xmax-classfile-name test`}
  -Xno-forwarders              ${`-Xno-forwarders test`}
  -Xnojline                    ${`-Xnojline test`}
  -Xno-patmat-analysis         ${`-Xno-patmat-analysis test`}
  -Xno-uescape                 ${`-Xno-uescape test`}
  -Xplugin-list                ${`-Xplugin-list test`}
  -Xprint-pos                  ${`-Xprint-pos test`}
  -Xprint-types                ${`-Xprint-types test`}
  -Xprompt                     ${`-Xprompt test`}
  -Xresident                   ${`-Xresident test`}
  -Xshow-phases                ${`-Xshow-phases test`}
  -Xsource                     ${`-Xsource test`}
  -Xstrict-inference           ${`-Xstrict-inference test`}
  -Xverify                     ${`-Xverify test`}
  -Y                           ${`-Y test`}
"""

  def `-Xcheckinit test` = new ScalacOptions { def options = Seq(
    -Xcheckinit, "-Xcheckinit"
  )}

  def `-Xdev test` = new ScalacOptions { def options = Seq(
    -Xdev, "-Xdev"
  )}

  def `-Xdisable-assertions test` = new ScalacOptions { def options = Seq(
    -Xdisable-assertions, "-Xdisable-assertions"
  )}

  def `-Xelide-below test` = new ScalacOptions { def options = Seq(
    -Xelide-below ALL      , ("-Xelide-below", "-2147483648")
  , -Xelide-below FINEST   , ("-Xelide-below", "300")
  , -Xelide-below FINER    , ("-Xelide-below", "400")
  , -Xelide-below FINE     , ("-Xelide-below", "500")
  , -Xelide-below CONFIG   , ("-Xelide-below", "700")
  , -Xelide-below INFO     , ("-Xelide-below", "800")
  , -Xelide-below WARNING  , ("-Xelide-below", "900")
  , -Xelide-below SEVERE   , ("-Xelide-below", "1000")
  , -Xelide-below OFF      , ("-Xelide-below", "2147483647")
  , -Xelide-below MAXIMUM  , ("-Xelide-below", "2147483647")
  , -Xelide-below MINIMUM  , ("-Xelide-below", "-2147483648")
  , -Xelide-below ASSERTION, ("-Xelide-below", "2000")
  , -Xelide-below (-123)   , ("-Xelide-below", "-123")
  )}

  def `-Xexperimental test` = new ScalacOptions { def options = Seq(
    -Xexperimental, "-Xexperimental"
  )}

  def `-Xfatal-warnings test` = new ScalacOptions { def options = Seq(
    -Xfatal-warnings, "-Xfatal-warnings"
  )}

  def `-Xfull-lubs test` = new ScalacOptions { def options = Seq(
    -Xfull-lubs, "-Xfull-lubs"
  )}

  def `-Xfuture test` = new ScalacOptions { def options = Seq(
    -Xfuture, "-Xfuture"
  )}

  def `-Yinfer-argument-types test` = new ScalacOptions { def options = Seq(
    -Yinfer-argument-types, "-Yinfer-argument-types"
  )}

  def `-Xlint test` = new ScalacOptions { def options = Seq(
    -Xlint `_`                         , "-Xlint:_"
  , -Xlint help                        , "-Xlint:help"
  , -Xlint `adapted-args`              , "-Xlint:adapted-args"
  , -Xlint `-adapted-args`             , "-Xlint:-adapted-args"
  , -Xlint `nullary-unit`              , "-Xlint:nullary-unit"
  , -Xlint `-nullary-unit`             , "-Xlint:-nullary-unit"
  , -Xlint inaccessible                , "-Xlint:inaccessible"
  , -Xlint `-inaccessible`             , "-Xlint:-inaccessible"
  , -Xlint `nullary-override`          , "-Xlint:nullary-override"
  , -Xlint `-nullary-override`         , "-Xlint:-nullary-override"
  , -Xlint `infer-any`                 , "-Xlint:infer-any"
  , -Xlint `-infer-any`                , "-Xlint:-infer-any"
  , -Xlint `missing-interpolator`      , "-Xlint:missing-interpolator"
  , -Xlint `-missing-interpolator`     , "-Xlint:-missing-interpolator"
  , -Xlint `doc-detached`              , "-Xlint:doc-detached"
  , -Xlint `-doc-detached`             , "-Xlint:-doc-detached"
  , -Xlint `private-shadow`            , "-Xlint:private-shadow"
  , -Xlint `-private-shadow`           , "-Xlint:-private-shadow"
  , -Xlint `type-parameter-shadow`     , "-Xlint:type-parameter-shadow"
  , -Xlint `-type-parameter-shadow`    , "-Xlint:-type-parameter-shadow"
  , -Xlint `poly-implicit-overload`    , "-Xlint:poly-implicit-overload"
  , -Xlint `-poly-implicit-overload`   , "-Xlint:-poly-implicit-overload"
  , -Xlint `option-implicit`           , "-Xlint:option-implicit"
  , -Xlint `-option-implicit`          , "-Xlint:-option-implicit"
  , -Xlint `delayedinit-select`        , "-Xlint:delayedinit-select"
  , -Xlint `-delayedinit-select`       , "-Xlint:-delayedinit-select"
  , -Xlint `by-name-right-associative` , "-Xlint:by-name-right-associative"
  , -Xlint `-by-name-right-associative`, "-Xlint:-by-name-right-associative"
  , -Xlint `package-object-classes`    , "-Xlint:package-object-classes"
  , -Xlint `-package-object-classes`   , "-Xlint:-package-object-classes"
  , -Xlint `unsound-match`             , "-Xlint:unsound-match"
  , -Xlint `-unsound-match`            , "-Xlint:-unsound-match"
  , -Xlint ("foo-bar,-baz")            , "-Xlint:foo-bar,-baz"
  )}

  def `-Xlog-free-terms test` = new ScalacOptions { def options = Seq(
    -Xlog-free-terms, "-Xlog-free-terms"
  )}

  def `-Xlog-free-types test` = new ScalacOptions { def options = Seq(
    -Xlog-free-types, "-Xlog-free-types"
  )}

  def `-Xlog-implicit-conversions test` = new ScalacOptions { def options = Seq(
    -Xlog-implicit_conversions, "-Xlog-implicit-conversions"
  )}

  def `-Xlog-implicits test` = new ScalacOptions { def options = Seq(
    -Xlog-implicits, "-Xlog-implicits"
  )}

  def `-Xlog-reflective-calls test` = new ScalacOptions { def options = Seq(
    -Xlog-reflective-calls, "-Xlog-reflective-calls"
  )}

  def `-Xmax-classfile-name test` = new ScalacOptions { def options = Seq(
    -Xmax-classfile-name `72` , ("-Xmax-classfile-name", "72")
  , -Xmax-classfile-name (128), ("-Xmax-classfile-name", "128")
  )}

  def `-Xno-forwarders test` = new ScalacOptions { def options = Seq(
    -Xno-forwarders, "-Xno-forwarders"
  )}

  def `-Xnojline test` = new ScalacOptions { def options = Seq(
    -Xnojline, "-Xnojline"
  )}

  def `-Xno-patmat-analysis test` = new ScalacOptions { def options = Seq(
    -Xno-patmat-analysis, "-Xno-patmat-analysis"
  )}

  def `-Xno-uescape test` = new ScalacOptions { def options = Seq(
    -Xno-uescape, "-Xno-uescape"
  )}

  def `-Xplugin-list test` = new ScalacOptions { def options = Seq(
    -Xplugin-list, "-Xplugin-list"
  )}

  def `-Xprint-pos test` = new ScalacOptions { def options = Seq(
    -Xprint-pos, "-Xprint-pos"
  )}

  def `-Xprint-types test` = new ScalacOptions { def options = Seq(
    -Xprint-types, "-Xprint-types"
  )}

  def `-Xprompt test` = new ScalacOptions { def options = Seq(
    -Xprompt, "-Xprompt"
  )}

  def `-Xresident test` = new ScalacOptions { def options = Seq(
    -Xresident, "-Xresident"
  )}

  def `-Xshow-phases test` = new ScalacOptions { def options = Seq(
    -Xshow-phases, "-Xshow-phases"
  )}

  def `-Xsource test` = new ScalacOptions { def options = Seq(
    -Xsource `2`       , "-Xsource:2"
  , -Xsource `2.10`    , "-Xsource:2.10"
  , -Xsource `2.10.4`  , "-Xsource:2.10.4"
  , -Xsource `2.11`    , "-Xsource:2.11"
  , -Xsource `2.11.5`  , "-Xsource:2.11.5"
  , -Xsource (`2.10.4`), "-Xsource:2.10.4"
  , -Xsource (`2.11.5`), "-Xsource:2.11.5"
  , -Xsource ("2.3.4") , "-Xsource:2.3.4"
  )}

  def `-Xstrict-inference test` = new ScalacOptions { def options = Seq(
    -Xstrict-inference, "-Xstrict-inference"
  )}

  def `-Xverify test` = new ScalacOptions { def options = Seq(
    -Xverify, "-Xverify"
  )}

  def `-Y test` = new ScalacOptions { def options = Seq(
    -Y, "-Y"
  )}
}
