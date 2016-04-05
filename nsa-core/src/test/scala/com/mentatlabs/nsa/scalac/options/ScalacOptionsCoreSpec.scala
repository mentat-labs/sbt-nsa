package com.mentatlabs.nsa
package scalac
package options

import java.io.File

class ScalacOptionsCoreSpec extends ScalacOptionsSpec {
  def is = s2"""
  -deprecation         ${`-deprecation test`}         ${ScalacDeprecation}
  -encoding            ${`-encoding test`}            ${ScalacEncoding UTF-8}
  -explaintypes        ${`-explaintypes test`}        ${ScalacExplaintypes}
  -feature             ${`-feature test`}             ${ScalacFeature}
  -g                   ${`-g test`}                   ${ScalacG vars}
  -help                ${`-help test`}                ${ScalacHelp}
  -language            ${`-language test`}            ${ScalacLanguage `_`}
  -no-specialization   ${`-no-specialization test`}   ${ScalacNoSpecialization}
  -nobootcp            ${`-nobootcp test`}            ${ScalacNobootcp}
  -nowarn              ${`-nowarn test`}              ${ScalacNowarn}
  -optimise            ${`-optimise test`}            ${ScalacOptimise}
  -print               ${`-print test`}               ${ScalacPrint}
  -sourcepath          ${`-sourcepath test`}          ${ScalacSourcepath ("foo")}
  -target              ${`-target test`}              ${ScalacTarget jvm-1.8}
  -unchecked           ${`-unchecked test`}           ${ScalacUnchecked}
  -uniqid              ${`-uniqid test`}              ${ScalacUniqid}
  -usejavacp           ${`-usejavacp test`}           ${ScalacUsejavacp}
  -usemanifestcp       ${`-usemanifestcp test`}       ${ScalacUsemanifestcp}
  -verbose             ${`-verbose test`}             ${ScalacVerbose}
  -version             ${`-version test`}             ${ScalacVersion}
  -X                   ${`-X test`}                   ${ScalacX}
"""

  def `-deprecation test` =
    (ScalacDeprecation)         =>= "-deprecation" and
    (ScalacDeprecation `false`) =>= "-deprecation:false" and
    (ScalacDeprecation (false)) =>= "-deprecation:false"

  def `-encoding test` =
    (ScalacEncoding ASCII)      =>= "-encoding ASCII" and
    (ScalacEncoding UTF-8)      =>= "-encoding UTF-8" and
    (ScalacEncoding ISO-8859-1) =>= "-encoding ISO-8859-1" and
    (ScalacEncoding ("FooBar")) =>= "-encoding FooBar"

  def `-explaintypes test` =
    ScalacExplaintypes =>= "-explaintypes"

  def `-feature test` =
    ScalacFeature =>= "-feature"

  def `-g test` =
    (ScalacG none)        =>= "-g:none" and
    (ScalacG source)      =>= "-g:source" and
    (ScalacG line)        =>= "-g:line" and
    (ScalacG vars)        =>= "-g:vars" and
    (ScalacG notailcalls) =>= "-g:notailcalls" and
    (ScalacG ("notc"))    =>= "-g:notc"

  def `-help test` =
    ScalacHelp =>= "-help"

  def `-language test` =
    (ScalacLanguage `_`)                    =>= "-language:_" and
    (ScalacLanguage help)                   =>= "-language:help" and
    (ScalacLanguage dynamics)               =>= "-language:dynamics" and
    (ScalacLanguage `-dynamics`)            =>= "-language:-dynamics" and
    (ScalacLanguage postfixOps)             =>= "-language:postfixOps" and
    (ScalacLanguage `-postfixOps`)          =>= "-language:-postfixOps" and
    (ScalacLanguage reflectiveCalls)        =>= "-language:reflectiveCalls" and
    (ScalacLanguage `-reflectiveCalls`)     =>= "-language:-reflectiveCalls" and
    (ScalacLanguage implicitConversions)    =>= "-language:implicitConversions" and
    (ScalacLanguage `-implicitConversions`) =>= "-language:-implicitConversions" and
    (ScalacLanguage existentials)           =>= "-language:existentials" and
    (ScalacLanguage `-existentials`)        =>= "-language:-existentials" and
    (ScalacLanguage `experimental.macros`)  =>= "-language:experimental.macros" and
    (ScalacLanguage `-experimental.macros`) =>= "-language:-experimental.macros" and
    (ScalacLanguage ("fooBar,-baz"))        =>= "-language:fooBar,-baz"

  def `-nobootcp test` =
    ScalacNobootcp =>= "-nobootcp"

  def `-no-specialization test` =
    ScalacNoSpecialization =>= "-no-specialization"

  def `-nowarn test` =
    ScalacNowarn =>= "-nowarn"

  def `-optimise test` =
    ScalacOptimise =>= "-optimise"

  def `-print test` =
    ScalacPrint =>= "-print"

  def `-sourcepath test` =
    ScalacSourcepath ("foo")                =>= "-sourcepath foo" and
    ScalacSourcepath ("./bar")              =>= s"-sourcepath .${FS}bar" and
    ScalacSourcepath (new File("X:/y/"))    =>= s"-sourcepath X:${FS}y" and
    ScalacSourcepath (new File("/tmp/fs/")) =>= s"-sourcepath ${FS}tmp${FS}fs"

  def `-target test` =
    (ScalacTarget `jvm-1.6`) =>= "-target:jvm-1.6" and
    (ScalacTarget jvm-1.7)   =>= "-target:jvm-1.7" and
    (ScalacTarget ("msil"))  =>= "-target:msil" and
    (ScalacTarget ("cldc"))  =>= "-target:cldc"

  def `-unchecked test` =
    ScalacUnchecked =>= "-unchecked"

  def `-uniqid test` =
    ScalacUniqid =>= "-uniqid"

  def `-usejavacp test` =
    ScalacUsejavacp =>= "-usejavacp"

  def `-usemanifestcp test` =
    ScalacUsemanifestcp =>= "-usemanifestcp"

  def `-verbose test` =
    ScalacVerbose =>= "-verbose"

  def `-version test` =
    ScalacVersion =>= "-version"

  def `-X test` =
    ScalacX =>= "-X"
}
