package com.mentatlabs.nsa
package scalac
package options

class ScalacOptionsAdvancedSpec extends ScalacOptionsSpec {
  def is = s2"""
  -Xcheckinit                  ${`-Xcheckinit test`}                ${ScalacXCheckinit}
  -Xdev                        ${`-Xdev test`}                      ${ScalacXDev}
  -Xdisable-assertions         ${`-Xdisable-assertions test`}       ${ScalacXDisableAssertions}
  -Xelide-below                ${`-Xelide-below test`}              ${ScalacXElideBelow OFF}
  -Xexperimental               ${`-Xexperimental test`}             ${ScalacXExperimental}
  -Xfatal-warnings             ${`-Xfatal-warnings test`}           ${ScalacXFatalWarnings}
  -Xfull-lubs                  ${`-Xfull-lubs test`}                ${ScalacXFullLubs}
  -Xfuture                     ${`-Xfuture test`}                   ${ScalacXFuture}
  -Xlint                       ${`-Xlint test`}                     ${ScalacXLint `_`}
  -Xlog-free-terms             ${`-Xlog-free-terms test`}           ${ScalacXLogFreeTerms}
  -Xlog-free-types             ${`-Xlog-free-types test`}           ${ScalacXLogFreeTypes}
  -Xlog-implicit-conversions   ${`-Xlog-implicit-conversions test`} ${ScalacXLogImplicitConversions}
  -Xlog-implicits              ${`-Xlog-implicits test`}            ${ScalacXLogImplicits}
  -Xlog-reflective-calls       ${`-Xlog-reflective-calls test`}     ${ScalacXLogReflectiveCalls}
  -Xmax-classfile-name         ${`-Xmax-classfile-name test`}       ${ScalacXMaxClassfileName `72`}
  -Xno-forwarders              ${`-Xno-forwarders test`}            ${ScalacXNoForwarders}
  -Xnojline                    ${`-Xnojline test`}                  ${ScalacXNojline}
  -Xno-patmat-analysis         ${`-Xno-patmat-analysis test`}       ${ScalacXNoPatmatAnalysis}
  -Xno-uescape                 ${`-Xno-uescape test`}               ${ScalacXNoUescape}
  -Xplugin-list                ${`-Xplugin-list test`}              ${ScalacXPluginList}
  -Xprint-pos                  ${`-Xprint-pos test`}                ${ScalacXPrintPos}
  -Xprint-types                ${`-Xprint-types test`}              ${ScalacXPrintTypes}
  -Xprompt                     ${`-Xprompt test`}                   ${ScalacXPrompt}
  -Xresident                   ${`-Xresident test`}                 ${ScalacXResident}
  -Xshow-phases                ${`-Xshow-phases test`}              ${ScalacXShowPhases}
  -Xsource                     ${`-Xsource test`}                   ${ScalacXSource `2.11`}
  -Xstrict-inference           ${`-Xstrict-inference test`}         ${ScalacXStrictInference}
  -Xverify                     ${`-Xverify test`}                   ${ScalacXVerify}
  -Y                           ${`-Y test`}                         ${ScalacY}
"""

  def `-Xcheckinit test` =
    ScalacXCheckinit =>= "-Xcheckinit"

  def `-Xdev test` =
    ScalacXDev =>= "-Xdev"

  def `-Xdisable-assertions test` =
    ScalacXDisableAssertions =>= "-Xdisable-assertions"

  def `-Xelide-below test` =
    (ScalacXElideBelow ALL)       =>= "-Xelide-below -2147483648" and
    (ScalacXElideBelow FINEST)    =>= "-Xelide-below 300" and
    (ScalacXElideBelow FINER)     =>= "-Xelide-below 400" and
    (ScalacXElideBelow FINE)      =>= "-Xelide-below 500" and
    (ScalacXElideBelow CONFIG)    =>= "-Xelide-below 700" and
    (ScalacXElideBelow INFO)      =>= "-Xelide-below 800" and
    (ScalacXElideBelow WARNING)   =>= "-Xelide-below 900" and
    (ScalacXElideBelow SEVERE)    =>= "-Xelide-below 1000" and
    (ScalacXElideBelow OFF)       =>= "-Xelide-below 2147483647" and
    (ScalacXElideBelow MAXIMUM)   =>= "-Xelide-below 2147483647" and
    (ScalacXElideBelow MINIMUM)   =>= "-Xelide-below -2147483648" and
    (ScalacXElideBelow ASSERTION) =>= "-Xelide-below 2000" and
    (ScalacXElideBelow (-123))    =>= "-Xelide-below -123"

  def `-Xexperimental test` =
    ScalacXExperimental =>= "-Xexperimental"

  def `-Xfatal-warnings test` =
    ScalacXFatalWarnings =>= "-Xfatal-warnings"

  def `-Xfull-lubs test` =
    ScalacXFullLubs =>= "-Xfull-lubs"

  def `-Xfuture test` =
    ScalacXFuture =>= "-Xfuture"

  def `-Xlint test` =
    (ScalacXLint `_`)                          =>= "-Xlint:_" and
    (ScalacXLint help)                         =>= "-Xlint:help" and
    (ScalacXLint `adapted-args`)               =>= "-Xlint:adapted-args" and
    (ScalacXLint `-adapted-args`)              =>= "-Xlint:-adapted-args" and
    (ScalacXLint `nullary-unit`)               =>= "-Xlint:nullary-unit" and
    (ScalacXLint `-nullary-unit`)              =>= "-Xlint:-nullary-unit" and
    (ScalacXLint inaccessible)                 =>= "-Xlint:inaccessible" and
    (ScalacXLint `-inaccessible`)              =>= "-Xlint:-inaccessible" and
    (ScalacXLint `nullary-override`)           =>= "-Xlint:nullary-override" and
    (ScalacXLint `-nullary-override`)          =>= "-Xlint:-nullary-override" and
    (ScalacXLint `infer-any`)                  =>= "-Xlint:infer-any" and
    (ScalacXLint `-infer-any`)                 =>= "-Xlint:-infer-any" and
    (ScalacXLint `missing-interpolator`)       =>= "-Xlint:missing-interpolator" and
    (ScalacXLint `-missing-interpolator`)      =>= "-Xlint:-missing-interpolator" and
    (ScalacXLint `doc-detached`)               =>= "-Xlint:doc-detached" and
    (ScalacXLint `-doc-detached`)              =>= "-Xlint:-doc-detached" and
    (ScalacXLint `private-shadow`)             =>= "-Xlint:private-shadow" and
    (ScalacXLint `-private-shadow`)            =>= "-Xlint:-private-shadow" and
    (ScalacXLint `type-parameter-shadow`)      =>= "-Xlint:type-parameter-shadow" and
    (ScalacXLint `-type-parameter-shadow`)     =>= "-Xlint:-type-parameter-shadow" and
    (ScalacXLint `poly-implicit-overload`)     =>= "-Xlint:poly-implicit-overload" and
    (ScalacXLint `-poly-implicit-overload`)    =>= "-Xlint:-poly-implicit-overload" and
    (ScalacXLint `option-implicit`)            =>= "-Xlint:option-implicit" and
    (ScalacXLint `-option-implicit`)           =>= "-Xlint:-option-implicit" and
    (ScalacXLint `delayedinit-select`)         =>= "-Xlint:delayedinit-select" and
    (ScalacXLint `-delayedinit-select`)        =>= "-Xlint:-delayedinit-select" and
    (ScalacXLint `by-name-right-associative`)  =>= "-Xlint:by-name-right-associative" and
    (ScalacXLint `-by-name-right-associative`) =>= "-Xlint:-by-name-right-associative" and
    (ScalacXLint `package-object-classes`)     =>= "-Xlint:package-object-classes" and
    (ScalacXLint `-package-object-classes`)    =>= "-Xlint:-package-object-classes" and
    (ScalacXLint `unsound-match`)              =>= "-Xlint:unsound-match" and
    (ScalacXLint ("fooBar,-baz"))              =>= "-Xlint:fooBar,-baz"

  def `-Xlog-free-terms test` =
    ScalacXLogFreeTerms =>= "-Xlog-free-terms"

  def `-Xlog-free-types test` =
    ScalacXLogFreeTypes =>= "-Xlog-free-types"

  def `-Xlog-implicit-conversions test` =
    ScalacXLogImplicitConversions =>= "-Xlog-implicit-conversions"

  def `-Xlog-implicits test` =
    ScalacXLogImplicits =>= "-Xlog-implicits"

  def `-Xlog-reflective-calls test` =
    ScalacXLogReflectiveCalls =>= "-Xlog-reflective-calls"

  def `-Xmax-classfile-name test` =
    (ScalacXMaxClassfileName `72`)  =>= "-Xmax-classfile-name 72" and
    (ScalacXMaxClassfileName (128)) =>= "-Xmax-classfile-name 128"

  def `-Xno-forwarders test` =
    ScalacXNoForwarders =>= "-Xno-forwarders"

  def `-Xnojline test` =
    ScalacXNojline =>= "-Xnojline"

  def `-Xno-patmat-analysis test` =
    ScalacXNoPatmatAnalysis =>= "-Xno-patmat-analysis"

  def `-Xno-uescape test` =
    ScalacXNoUescape =>= "-Xno-uescape"

  def `-Xplugin-list test` =
    ScalacXPluginList =>= "-Xplugin-list"

  def `-Xprint-pos test` =
    ScalacXPrintPos =>= "-Xprint-pos"

  def `-Xprint-types test` =
    ScalacXPrintTypes =>= "-Xprint-types"

  def `-Xprompt test` =
    ScalacXPrompt =>= "-Xprompt"

  def `-Xresident test` =
    ScalacXResident =>= "-Xresident"

  def `-Xshow-phases test` =
    ScalacXShowPhases =>= "-Xshow-phases"

  def `-Xsource test` =
    (ScalacXSource `2`)       =>= "-Xsource:2" and
    (ScalacXSource `2.0`)     =>= "-Xsource:2.0" and
    (ScalacXSource `2.0.0`)   =>= "-Xsource:2.0.0" and
    (ScalacXSource `2.3`)     =>= "-Xsource:2.3" and
    (ScalacXSource `2.3.0`)   =>= "-Xsource:2.3.0" and
    (ScalacXSource `2.3.1`)   =>= "-Xsource:2.3.1" and
    (ScalacXSource `2.3.2`)   =>= "-Xsource:2.3.2" and
    (ScalacXSource `2.3.3`)   =>= "-Xsource:2.3.3" and
    (ScalacXSource `2.4`)     =>= "-Xsource:2.4" and
    (ScalacXSource `2.4.0`)   =>= "-Xsource:2.4.0" and
    (ScalacXSource `2.5`)     =>= "-Xsource:2.5" and
    (ScalacXSource `2.5.0`)   =>= "-Xsource:2.5.0" and
    (ScalacXSource `2.5.1`)   =>= "-Xsource:2.5.1" and
    (ScalacXSource `2.6`)     =>= "-Xsource:2.6" and
    (ScalacXSource `2.6.0`)   =>= "-Xsource:2.6.0" and
    (ScalacXSource `2.6.1`)   =>= "-Xsource:2.6.1" and
    (ScalacXSource `2.7`)     =>= "-Xsource:2.7" and
    (ScalacXSource `2.7.0`)   =>= "-Xsource:2.7.0" and
    (ScalacXSource `2.7.1`)   =>= "-Xsource:2.7.1" and
    (ScalacXSource `2.7.2`)   =>= "-Xsource:2.7.2" and
    (ScalacXSource `2.7.3`)   =>= "-Xsource:2.7.3" and
    (ScalacXSource `2.7.4`)   =>= "-Xsource:2.7.4" and
    (ScalacXSource `2.7.5`)   =>= "-Xsource:2.7.5" and
    (ScalacXSource `2.7.6`)   =>= "-Xsource:2.7.6" and
    (ScalacXSource `2.7.7`)   =>= "-Xsource:2.7.7" and
    (ScalacXSource `2.8`)     =>= "-Xsource:2.8" and
    (ScalacXSource `2.8.0`)   =>= "-Xsource:2.8.0" and
    (ScalacXSource `2.8.1`)   =>= "-Xsource:2.8.1" and
    (ScalacXSource `2.8.2`)   =>= "-Xsource:2.8.2" and
    (ScalacXSource `2.9`)     =>= "-Xsource:2.9" and
    (ScalacXSource `2.9.0`)   =>= "-Xsource:2.9.0" and
    (ScalacXSource `2.9.0-1`) =>= "-Xsource:2.9.0-1" and
    (ScalacXSource `2.9.1`)   =>= "-Xsource:2.9.1" and
    (ScalacXSource `2.9.1-1`) =>= "-Xsource:2.9.1-1" and
    (ScalacXSource `2.9.2`)   =>= "-Xsource:2.9.2" and
    (ScalacXSource `2.9.3`)   =>= "-Xsource:2.9.3" and
    (ScalacXSource `2.10`)    =>= "-Xsource:2.10" and
    (ScalacXSource `2.10.0`)  =>= "-Xsource:2.10.0" and
    (ScalacXSource `2.10.1`)  =>= "-Xsource:2.10.1" and
    (ScalacXSource `2.10.2`)  =>= "-Xsource:2.10.2" and
    (ScalacXSource `2.10.3`)  =>= "-Xsource:2.10.3" and
    (ScalacXSource `2.10.4`)  =>= "-Xsource:2.10.4" and
    (ScalacXSource `2.10.5`)  =>= "-Xsource:2.10.5" and
    (ScalacXSource `2.10.6`)  =>= "-Xsource:2.10.6" and
    (ScalacXSource `2.11`)    =>= "-Xsource:2.11" and
    (ScalacXSource `2.11.0`)  =>= "-Xsource:2.11.0" and
    (ScalacXSource `2.11.1`)  =>= "-Xsource:2.11.1" and
    (ScalacXSource `2.11.2`)  =>= "-Xsource:2.11.2" and
    (ScalacXSource `2.11.3`)  =>= "-Xsource:2.11.3" and
    (ScalacXSource `2.11.4`)  =>= "-Xsource:2.11.4" and
    (ScalacXSource `2.11.5`)  =>= "-Xsource:2.11.5" and
    (ScalacXSource `2.11.6`)  =>= "-Xsource:2.11.6" and
    (ScalacXSource `2.11.7`)  =>= "-Xsource:2.11.7" and
    (ScalacXSource `2.11.8`)  =>= "-Xsource:2.11.8" and
    (ScalacXSource `2.12`)    =>= "-Xsource:2.12" and
    (ScalacXSource `2.12.0`)  =>= "-Xsource:2.12.0"
    (ScalacXSource ("3.0"))   =>= "-Xsource:3.0"

  def `-Xstrict-inference test` =
    ScalacXStrictInference =>= "-Xstrict-inference"

  def `-Xverify test` =
    ScalacXVerify =>= "-Xverify"

  def `-Y test` =
    ScalacY =>= "-Y"
}
