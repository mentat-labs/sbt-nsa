package com.mentatlabs.nsa
package test

class AdvancedOptionsSpec extends TypedOptionsSpec {
  def is = s2"""
  -Xcheckinit                  ${`-Xcheckinit test`}                  ${`-Xcheckinit`}
  -Xdev                        ${`-Xdev test`}                        ${`-Xdev`}
  -Xdisable-assertions         ${`-Xdisable-assertions test`}         ${`-Xdisable-assertions`}
  -Xelide-below                ${`-Xelide-below test`}                ${`-Xelide-below` OFF}
  -Xexperimental               ${`-Xexperimental test`}               ${`-Xexperimental`}
  -Xfatal-warnings             ${`-Xfatal-warnings test`}             ${`-Xfatal-warnings`}
  -Xfull-lubs                  ${`-Xfull-lubs test`}                  ${`-Xfull-lubs`}
  -Xfuture                     ${`-Xfuture test`}                     ${`-Xfuture`}
  -Xlint                       ${`-Xlint test`}                       ${`-Xlint` `_`}
  -Xlog-free-terms             ${`-Xlog-free-terms test`}             ${`-Xlog-free-terms`}
  -Xlog-free-types             ${`-Xlog-free-types test`}             ${`-Xlog-free-types`}
  -Xlog-implicit-conversions   ${`-Xlog-implicit-conversions test`}   ${`-Xlog-implicit-conversions`}
  -Xlog-implicits              ${`-Xlog-implicits test`}              ${`-Xlog-implicits`}
  -Xlog-reflective-calls       ${`-Xlog-reflective-calls test`}       ${`-Xlog-reflective-calls`}
  -Xmax-classfile-name         ${`-Xmax-classfile-name test`}         ${`-Xmax-classfile-name` `72`}
  -Xno-forwarders              ${`-Xno-forwarders test`}              ${`-Xno-forwarders`}
  -Xnojline                    ${`-Xnojline test`}                    ${`-Xnojline`}
  -Xno-patmat-analysis         ${`-Xno-patmat-analysis test`}         ${`-Xno-patmat-analysis`}
  -Xno-uescape                 ${`-Xno-uescape test`}                 ${`-Xno-uescape`}
  -Xplugin-list                ${`-Xplugin-list test`}                ${`-Xplugin-list`}
  -Xprint-pos                  ${`-Xprint-pos test`}                  ${`-Xprint-pos`}
  -Xprint-types                ${`-Xprint-types test`}                ${`-Xprint-types`}
  -Xprompt                     ${`-Xprompt test`}                     ${`-Xprompt`}
  -Xresident                   ${`-Xresident test`}                   ${`-Xresident`}
  -Xshow-phases                ${`-Xshow-phases test`}                ${`-Xshow-phases`}
  -Xsource                     ${`-Xsource test`}                     ${`-Xsource` `2`}
  -Xstrict-inference           ${`-Xstrict-inference test`}           ${`-Xstrict-inference`}
  -Xverify                     ${`-Xverify test`}                     ${`-Xverify`}
  -Y                           ${`-Y test`}                           ${`-Y`}
"""

  def `-Xcheckinit test` =
    `-Xcheckinit` =>= "-Xcheckinit"

  def `-Xdev test` =
    `-Xdev` =>= "-Xdev"

  def `-Xdisable-assertions test` =
    `-Xdisable-assertions` =>= "-Xdisable-assertions"

  def `-Xelide-below test` =
    (`-Xelide-below` ALL)         =>= "-Xelide-below -2147483648" and
    (`-Xelide-below` FINEST)      =>= "-Xelide-below 300" and
    (`-Xelide-below` FINER)       =>= "-Xelide-below 400" and
    (`-Xelide-below` FINE)        =>= "-Xelide-below 500" and
    (`-Xelide-below` CONFIG)      =>= "-Xelide-below 700" and
    (`-Xelide-below` INFO)        =>= "-Xelide-below 800" and
    (`-Xelide-below` WARNING)     =>= "-Xelide-below 900" and
    (`-Xelide-below` SEVERE)      =>= "-Xelide-below 1000" and
    (`-Xelide-below` OFF)         =>= "-Xelide-below 2147483647" and
    (`-Xelide-below` MAXIMUM)     =>= "-Xelide-below 2147483647" and
    (`-Xelide-below` MINIMUM)     =>= "-Xelide-below -2147483648" and
    (`-Xelide-below` ASSERTION)   =>= "-Xelide-below 2000" and
    (`-Xelide-below` custom -123) =>= "-Xelide-below -123"

  def `-Xexperimental test` =
    `-Xexperimental` =>= "-Xexperimental"

  def `-Xfatal-warnings test` =
    `-Xfatal-warnings` =>= "-Xfatal-warnings"

  def `-Xfull-lubs test` =
    `-Xfull-lubs` =>= "-Xfull-lubs"

  def `-Xfuture test` =
    `-Xfuture` =>= "-Xfuture"

  def `-Xlint test` =
    (`-Xlint` `_`)                          =>= "-Xlint:_" and
    (`-Xlint` help)                         =>= "-Xlint:help" and
    (`-Xlint` `adapted-args`)               =>= "-Xlint:adapted-args" and
    (`-Xlint` `-adapted-args`)              =>= "-Xlint:-adapted-args" and
    (`-Xlint` `nullary-unit`)               =>= "-Xlint:nullary-unit" and
    (`-Xlint` `-nullary-unit`)              =>= "-Xlint:-nullary-unit" and
    (`-Xlint` inaccessible)                 =>= "-Xlint:inaccessible" and
    (`-Xlint` `-inaccessible`)              =>= "-Xlint:-inaccessible" and
    (`-Xlint` `nullary-override`)           =>= "-Xlint:nullary-override" and
    (`-Xlint` `-nullary-override`)          =>= "-Xlint:-nullary-override" and
    (`-Xlint` `infer-any`)                  =>= "-Xlint:infer-any" and
    (`-Xlint` `-infer-any`)                 =>= "-Xlint:-infer-any" and
    (`-Xlint` `missing-interpolator`)       =>= "-Xlint:missing-interpolator" and
    (`-Xlint` `-missing-interpolator`)      =>= "-Xlint:-missing-interpolator" and
    (`-Xlint` `doc-detached`)               =>= "-Xlint:doc-detached" and
    (`-Xlint` `-doc-detached`)              =>= "-Xlint:-doc-detached" and
    (`-Xlint` `private-shadow`)             =>= "-Xlint:private-shadow" and
    (`-Xlint` `-private-shadow`)            =>= "-Xlint:-private-shadow" and
    (`-Xlint` `type-parameter-shadow`)      =>= "-Xlint:type-parameter-shadow" and
    (`-Xlint` `-type-parameter-shadow`)     =>= "-Xlint:-type-parameter-shadow" and
    (`-Xlint` `poly-implicit-overload`)     =>= "-Xlint:poly-implicit-overload" and
    (`-Xlint` `-poly-implicit-overload`)    =>= "-Xlint:-poly-implicit-overload" and
    (`-Xlint` `option-implicit`)            =>= "-Xlint:option-implicit" and
    (`-Xlint` `-option-implicit`)           =>= "-Xlint:-option-implicit" and
    (`-Xlint` `delayedinit-select`)         =>= "-Xlint:delayedinit-select" and
    (`-Xlint` `-delayedinit-select`)        =>= "-Xlint:-delayedinit-select" and
    (`-Xlint` `by-name-right-associative`)  =>= "-Xlint:by-name-right-associative" and
    (`-Xlint` `-by-name-right-associative`) =>= "-Xlint:-by-name-right-associative" and
    (`-Xlint` `package-object-classes`)     =>= "-Xlint:package-object-classes" and
    (`-Xlint` `-package-object-classes`)    =>= "-Xlint:-package-object-classes" and
    (`-Xlint` `unsound-match`)              =>= "-Xlint:unsound-match" and
    (`-Xlint` `-unsound-match`)             =>= "-Xlint:-unsound-match"

  def `-Xlog-free-terms test` =
    `-Xlog-free-terms` =>= "-Xlog-free-terms"

  def `-Xlog-free-types test` =
    `-Xlog-free-types` =>= "-Xlog-free-types"

  def `-Xlog-implicit-conversions test` =
    `-Xlog-implicit-conversions` =>= "-Xlog-implicit-conversions"

  def `-Xlog-implicits test` =
    `-Xlog-implicits` =>= "-Xlog-implicits"

  def `-Xlog-reflective-calls test` =
    `-Xlog-reflective-calls` =>= "-Xlog-reflective-calls"

  def `-Xmax-classfile-name test` =
    (`-Xmax-classfile-name` `72`)       =>= "-Xmax-classfile-name 72" and
    (`-Xmax-classfile-name` custom 256) =>= "-Xmax-classfile-name 256"

  def `-Xno-forwarders test` =
    `-Xno-forwarders` =>= "-Xno-forwarders"

  def `-Xnojline test` =
    `-Xnojline` =>= "-Xnojline"

  def `-Xno-patmat-analysis test` =
    `-Xno-patmat-analysis` =>= "-Xno-patmat-analysis"

  def `-Xno-uescape test` =
    `-Xno-uescape` =>= "-Xno-uescape"

  def `-Xplugin-list test` =
    `-Xplugin-list` =>= "-Xplugin-list"

  def `-Xprint-pos test` =
    `-Xprint-pos` =>= "-Xprint-pos"

  def `-Xprint-types test` =
    `-Xprint-types` =>= "-Xprint-types"

  def `-Xprompt test` =
    `-Xprompt` =>= "-Xprompt"

  def `-Xresident test` =
    `-Xresident` =>= "-Xresident"

  def `-Xshow-phases test` =
    `-Xshow-phases` =>= "-Xshow-phases"

  def `-Xsource test` =
    (`-Xsource` `2`)       =>= "-Xsource:2" and
    (`-Xsource` `2.0`)     =>= "-Xsource:2.0" and
    (`-Xsource` `2.0.0`)   =>= "-Xsource:2.0.0" and
    (`-Xsource` `2.3`)     =>= "-Xsource:2.3" and
    (`-Xsource` `2.3.0`)   =>= "-Xsource:2.3.0" and
    (`-Xsource` `2.3.1`)   =>= "-Xsource:2.3.1" and
    (`-Xsource` `2.3.2`)   =>= "-Xsource:2.3.2" and
    (`-Xsource` `2.3.3`)   =>= "-Xsource:2.3.3" and
    (`-Xsource` `2.4`)     =>= "-Xsource:2.4" and
    (`-Xsource` `2.4.0`)   =>= "-Xsource:2.4.0" and
    (`-Xsource` `2.5`)     =>= "-Xsource:2.5" and
    (`-Xsource` `2.5.0`)   =>= "-Xsource:2.5.0" and
    (`-Xsource` `2.5.1`)   =>= "-Xsource:2.5.1" and
    (`-Xsource` `2.6`)     =>= "-Xsource:2.6" and
    (`-Xsource` `2.6.0`)   =>= "-Xsource:2.6.0" and
    (`-Xsource` `2.6.1`)   =>= "-Xsource:2.6.1" and
    (`-Xsource` `2.7`)     =>= "-Xsource:2.7" and
    (`-Xsource` `2.7.0`)   =>= "-Xsource:2.7.0" and
    (`-Xsource` `2.7.1`)   =>= "-Xsource:2.7.1" and
    (`-Xsource` `2.7.2`)   =>= "-Xsource:2.7.2" and
    (`-Xsource` `2.7.3`)   =>= "-Xsource:2.7.3" and
    (`-Xsource` `2.7.4`)   =>= "-Xsource:2.7.4" and
    (`-Xsource` `2.7.5`)   =>= "-Xsource:2.7.5" and
    (`-Xsource` `2.7.6`)   =>= "-Xsource:2.7.6" and
    (`-Xsource` `2.7.7`)   =>= "-Xsource:2.7.7" and
    (`-Xsource` `2.8`)     =>= "-Xsource:2.8" and
    (`-Xsource` `2.8.0`)   =>= "-Xsource:2.8.0" and
    (`-Xsource` `2.8.1`)   =>= "-Xsource:2.8.1" and
    (`-Xsource` `2.8.2`)   =>= "-Xsource:2.8.2" and
    (`-Xsource` `2.9`)     =>= "-Xsource:2.9" and
    (`-Xsource` `2.9.0`)   =>= "-Xsource:2.9.0" and
    (`-Xsource` `2.9.0-1`) =>= "-Xsource:2.9.0-1" and
    (`-Xsource` `2.9.1`)   =>= "-Xsource:2.9.1" and
    (`-Xsource` `2.9.1-1`) =>= "-Xsource:2.9.1-1" and
    (`-Xsource` `2.9.2`)   =>= "-Xsource:2.9.2" and
    (`-Xsource` `2.9.3`)   =>= "-Xsource:2.9.3" and
    (`-Xsource` `2.10`)    =>= "-Xsource:2.10" and
    (`-Xsource` `2.10.0`)  =>= "-Xsource:2.10.0" and
    (`-Xsource` `2.10.1`)  =>= "-Xsource:2.10.1" and
    (`-Xsource` `2.10.2`)  =>= "-Xsource:2.10.2" and
    (`-Xsource` `2.10.3`)  =>= "-Xsource:2.10.3" and
    (`-Xsource` `2.10.4`)  =>= "-Xsource:2.10.4" and
    (`-Xsource` `2.11`)    =>= "-Xsource:2.11" and
    (`-Xsource` `2.11.0`)  =>= "-Xsource:2.11.0" and
    (`-Xsource` `2.11.1`)  =>= "-Xsource:2.11.1" and
    (`-Xsource` `2.11.2`)  =>= "-Xsource:2.11.2" and
    (`-Xsource` `2.11.3`)  =>= "-Xsource:2.11.3" and
    (`-Xsource` `2.11.4`)  =>= "-Xsource:2.11.4" and
    (`-Xsource` `2.12`)    =>= "-Xsource:2.12" and
    (`-Xsource` `2.12.0`)  =>= "-Xsource:2.12.0"

  def `-Xstrict-inference test` =
    `-Xstrict-inference` =>= "-Xstrict-inference"

  def `-Xverify test` =
    `-Xverify` =>= "-Xverify"

  def `-Y test` =
    `-Y` =>= "-Y"
}
