package com.mentatlabs.nsa.test

class DSLAdvancedOptionsSpec extends DSLOptionsSpec {
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

  def `-Xcheckinit test` = new TypedScalacOptions { def options = Seq(
    -Xcheckinit, "-Xcheckinit"
  )}

  def `-Xdev test` = new TypedScalacOptions { def options = Seq(
    -Xdev, "-Xdev"
  )}

  def `-Xdisable-assertions test` = new TypedScalacOptions { def options = Seq(
    -Xdisable-assertions, "-Xdisable-assertions"
  )}

  def `-Xelide-below test` = new TypedScalacOptions { def options = Seq(
    -Xelide-below ALL        , ("-Xelide-below", "-2147483648")
  , -Xelide-below FINEST     , ("-Xelide-below", "300")
  , -Xelide-below FINER      , ("-Xelide-below", "400")
  , -Xelide-below FINE       , ("-Xelide-below", "500")
  , -Xelide-below CONFIG     , ("-Xelide-below", "700")
  , -Xelide-below INFO       , ("-Xelide-below", "800")
  , -Xelide-below WARNING    , ("-Xelide-below", "900")
  , -Xelide-below SEVERE     , ("-Xelide-below", "1000")
  , -Xelide-below OFF        , ("-Xelide-below", "2147483647")
  , -Xelide-below MAXIMUM    , ("-Xelide-below", "2147483647")
  , -Xelide-below MINIMUM    , ("-Xelide-below", "-2147483648")
  , -Xelide-below ASSERTION  , ("-Xelide-below", "2000")
  , -Xelide-below custom -123, ("-Xelide-below", "-123")
  )}

  def `-Xexperimental test` = new TypedScalacOptions { def options = Seq(
    -Xexperimental, "-Xexperimental"
  )}

  def `-Xfatal-warnings test` = new TypedScalacOptions { def options = Seq(
    -Xfatal-warnings, "-Xfatal-warnings"
  )}

  def `-Xfull-lubs test` = new TypedScalacOptions { def options = Seq(
    -Xfull-lubs, "-Xfull-lubs"
  )}

  def `-Xfuture test` = new TypedScalacOptions { def options = Seq(
    -Xfuture, "-Xfuture"
  )}

  def `-Yinfer-argument-types test` = new TypedScalacOptions { def options = Seq(
    -Yinfer-argument-types, "-Yinfer-argument-types"
  )}

  def `-Xlint test` = new TypedScalacOptions { def options = Seq(
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
  )}

  def `-Xlog-free-terms test` = new TypedScalacOptions { def options = Seq(
    -Xlog-free-terms, "-Xlog-free-terms"
  )}

  def `-Xlog-free-types test` = new TypedScalacOptions { def options = Seq(
    -Xlog-free-types, "-Xlog-free-types"
  )}

  def `-Xlog-implicit-conversions test` = new TypedScalacOptions { def options = Seq(
    -Xlog-implicit_conversions, "-Xlog-implicit-conversions"
  )}

  def `-Xlog-implicits test` = new TypedScalacOptions { def options = Seq(
    -Xlog-implicits, "-Xlog-implicits"
  )}

  def `-Xlog-reflective-calls test` = new TypedScalacOptions { def options = Seq(
    -Xlog-reflective-calls, "-Xlog-reflective-calls"
  )}

  def `-Xmax-classfile-name test` = new TypedScalacOptions { def options = Seq(
    -Xmax-classfile-name `72`      , ("-Xmax-classfile-name", "72")
  , -Xmax-classfile-name custom 256, ("-Xmax-classfile-name", "256")
  )}

  def `-Xno-forwarders test` = new TypedScalacOptions { def options = Seq(
    -Xno-forwarders, "-Xno-forwarders"
  )}

  def `-Xnojline test` = new TypedScalacOptions { def options = Seq(
    -Xnojline, "-Xnojline"
  )}

  def `-Xno-patmat-analysis test` = new TypedScalacOptions { def options = Seq(
    -Xno-patmat-analysis, "-Xno-patmat-analysis"
  )}

  def `-Xno-uescape test` = new TypedScalacOptions { def options = Seq(
    -Xno-uescape, "-Xno-uescape"
  )}

  def `-Xplugin-list test` = new TypedScalacOptions { def options = Seq(
    -Xplugin-list, "-Xplugin-list"
  )}

  def `-Xprint-pos test` = new TypedScalacOptions { def options = Seq(
    -Xprint-pos, "-Xprint-pos"
  )}

  def `-Xprint-types test` = new TypedScalacOptions { def options = Seq(
    -Xprint-types, "-Xprint-types"
  )}

  def `-Xprompt test` = new TypedScalacOptions { def options = Seq(
    -Xprompt, "-Xprompt"
  )}

  def `-Xresident test` = new TypedScalacOptions { def options = Seq(
    -Xresident, "-Xresident"
  )}

  def `-Xshow-phases test` = new TypedScalacOptions { def options = Seq(
    -Xshow-phases, "-Xshow-phases"
  )}

  def `-Xsource test` = new TypedScalacOptions { def options = Seq(
    -Xsource `2`      , "-Xsource:2"
  , -Xsource `2.0`    , "-Xsource:2.0"
  , -Xsource `2.0.0`  , "-Xsource:2.0.0"
  , -Xsource `2.3`    , "-Xsource:2.3"
  , -Xsource `2.3.0`  , "-Xsource:2.3.0"
  , -Xsource `2.3.1`  , "-Xsource:2.3.1"
  , -Xsource `2.3.2`  , "-Xsource:2.3.2"
  , -Xsource `2.3.3`  , "-Xsource:2.3.3"
  , -Xsource `2.4`    , "-Xsource:2.4"
  , -Xsource `2.4.0`  , "-Xsource:2.4.0"
  , -Xsource `2.5`    , "-Xsource:2.5"
  , -Xsource `2.5.0`  , "-Xsource:2.5.0"
  , -Xsource `2.5.1`  , "-Xsource:2.5.1"
  , -Xsource `2.6`    , "-Xsource:2.6"
  , -Xsource `2.6.0`  , "-Xsource:2.6.0"
  , -Xsource `2.6.1`  , "-Xsource:2.6.1"
  , -Xsource `2.7`    , "-Xsource:2.7"
  , -Xsource `2.7.0`  , "-Xsource:2.7.0"
  , -Xsource `2.7.1`  , "-Xsource:2.7.1"
  , -Xsource `2.7.2`  , "-Xsource:2.7.2"
  , -Xsource `2.7.3`  , "-Xsource:2.7.3"
  , -Xsource `2.7.4`  , "-Xsource:2.7.4"
  , -Xsource `2.7.5`  , "-Xsource:2.7.5"
  , -Xsource `2.7.6`  , "-Xsource:2.7.6"
  , -Xsource `2.7.7`  , "-Xsource:2.7.7"
  , -Xsource `2.8`    , "-Xsource:2.8"
  , -Xsource `2.8.0`  , "-Xsource:2.8.0"
  , -Xsource `2.8.1`  , "-Xsource:2.8.1"
  , -Xsource `2.8.2`  , "-Xsource:2.8.2"
  , -Xsource `2.9`    , "-Xsource:2.9"
  , -Xsource `2.9.0`  , "-Xsource:2.9.0"
  , -Xsource `2.9.0-1`, "-Xsource:2.9.0-1"
  , -Xsource `2.9.1`  , "-Xsource:2.9.1"
  , -Xsource `2.9.1-1`, "-Xsource:2.9.1-1"
  , -Xsource `2.9.2`  , "-Xsource:2.9.2"
  , -Xsource `2.9.3`  , "-Xsource:2.9.3"
  , -Xsource `2.10`   , "-Xsource:2.10"
  , -Xsource `2.10.0` , "-Xsource:2.10.0"
  , -Xsource `2.10.1` , "-Xsource:2.10.1"
  , -Xsource `2.10.2` , "-Xsource:2.10.2"
  , -Xsource `2.10.3` , "-Xsource:2.10.3"
  , -Xsource `2.10.4` , "-Xsource:2.10.4"
  , -Xsource `2.11`   , "-Xsource:2.11"
  , -Xsource `2.11.0` , "-Xsource:2.11.0"
  , -Xsource `2.11.1` , "-Xsource:2.11.1"
  , -Xsource `2.11.2` , "-Xsource:2.11.2"
  , -Xsource `2.11.3` , "-Xsource:2.11.3"
  , -Xsource `2.11.4` , "-Xsource:2.11.4"
  , -Xsource `2.12`   , "-Xsource:2.12"
  , -Xsource `2.12.0` , "-Xsource:2.12.0"
  )}

  def `-Xstrict-inference test` = new TypedScalacOptions { def options = Seq(
    -Xstrict-inference, "-Xstrict-inference"
  )}

  def `-Xverify test` = new TypedScalacOptions { def options = Seq(
    -Xverify, "-Xverify"
  )}

  def `-Y test` = new TypedScalacOptions { def options = Seq(
    -Y, "-Y"
  )}
}
