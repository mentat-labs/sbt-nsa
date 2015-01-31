package com.mentatlabs.nsa
package scalac
package dsl
package experimental

import ScalacVersions._

class ScalacOptionsDSLExperimentalAdvancedSpec extends ScalacOptionsDSLExperimentalSpec {
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

  def `-Xcheckinit test` = new CheckDSL { init (
    -Xcheckinit, "-Xcheckinit"
  )}

  def `-Xdev test` = new CheckDSL { init (
    -Xdev, "-Xdev"
  )}

  def `-Xdisable-assertions test` = new CheckDSL { init (
    -Xdisable-assertions, "-Xdisable-assertions"
  )}

  def `-Xelide-below test` = new CheckDSL { init (
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

  def `-Xexperimental test` = new CheckDSL { init (
    -Xexperimental, "-Xexperimental"
  )}

  def `-Xfatal-warnings test` = new CheckDSL { init (
    -Xfatal-warnings, "-Xfatal-warnings"
  )}

  def `-Xfull-lubs test` = new CheckDSL { init (
    -Xfull-lubs, "-Xfull-lubs"
  )}

  def `-Xfuture test` = new CheckDSL { init (
    -Xfuture, "-Xfuture"
  )}

  def `-Yinfer-argument-types test` = new CheckDSL { init (
    -Yinfer-argument-types, "-Yinfer-argument-types"
  )}

  def `-Xlint test` = new CheckDSL { init (
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

  def `-Xlog-free-terms test` = new CheckDSL { init (
    -Xlog-free-terms, "-Xlog-free-terms"
  )}

  def `-Xlog-free-types test` = new CheckDSL { init (
    -Xlog-free-types, "-Xlog-free-types"
  )}

  def `-Xlog-implicit-conversions test` = new CheckDSL { init (
    -Xlog-implicit_conversions, "-Xlog-implicit-conversions"
  )}

  def `-Xlog-implicits test` = new CheckDSL { init (
    -Xlog-implicits, "-Xlog-implicits"
  )}

  def `-Xlog-reflective-calls test` = new CheckDSL { init (
    -Xlog-reflective-calls, "-Xlog-reflective-calls"
  )}

  def `-Xmax-classfile-name test` = new CheckDSL { init (
    -Xmax-classfile-name `72` , ("-Xmax-classfile-name", "72")
  , -Xmax-classfile-name (128), ("-Xmax-classfile-name", "128")
  )}

  def `-Xno-forwarders test` = new CheckDSL { init (
    -Xno-forwarders, "-Xno-forwarders"
  )}

  def `-Xnojline test` = new CheckDSL { init (
    -Xnojline, "-Xnojline"
  )}

  def `-Xno-patmat-analysis test` = new CheckDSL { init (
    -Xno-patmat-analysis, "-Xno-patmat-analysis"
  )}

  def `-Xno-uescape test` = new CheckDSL { init (
    -Xno-uescape, "-Xno-uescape"
  )}

  def `-Xplugin-list test` = new CheckDSL { init (
    -Xplugin-list, "-Xplugin-list"
  )}

  def `-Xprint-pos test` = new CheckDSL { init (
    -Xprint-pos, "-Xprint-pos"
  )}

  def `-Xprint-types test` = new CheckDSL { init (
    -Xprint-types, "-Xprint-types"
  )}

  def `-Xprompt test` = new CheckDSL { init (
    -Xprompt, "-Xprompt"
  )}

  def `-Xresident test` = new CheckDSL { init (
    -Xresident, "-Xresident"
  )}

  def `-Xshow-phases test` = new CheckDSL { init (
    -Xshow-phases, "-Xshow-phases"
  )}

  def `-Xsource test` = new CheckDSL { init (
    -Xsource `2`       , "-Xsource:2"
  , -Xsource `2.10`    , "-Xsource:2.10"
  , -Xsource `2.10.4`  , "-Xsource:2.10.4"
  , -Xsource `2.11`    , "-Xsource:2.11"
  , -Xsource `2.11.5`  , "-Xsource:2.11.5"
  , -Xsource (`2.10.4`), "-Xsource:2.10.4"
  , -Xsource (`2.11.5`), "-Xsource:2.11.5"
  , -Xsource ("2.3.4") , "-Xsource:2.3.4"
  )}

  def `-Xstrict-inference test` = new CheckDSL { init (
    -Xstrict-inference, "-Xstrict-inference"
  )}

  def `-Xverify test` = new CheckDSL { init (
    -Xverify, "-Xverify"
  )}

  def `-Y test` = new CheckDSL { init (
    -Y, "-Y"
  )}
}
