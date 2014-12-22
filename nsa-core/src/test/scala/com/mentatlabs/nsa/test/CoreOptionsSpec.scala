package com.mentatlabs.nsa
package test

class CoreOptionsSpec extends TypedOptionsSpec {
  def is = s2"""
  -deprecation         ${`-deprecation test`}         ${`-deprecation`}
  -encoding            ${`-encoding test`}            ${`-encoding` UTF-8}
  -explaintypes        ${`-explaintypes test`}        ${`-explaintypes`}
  -feature             ${`-feature test`}             ${`-feature`}
  -g                   ${`-g test`}                   ${`-g` vars}
  -help                ${`-help test`}                ${`-help`}
  -language            ${`-language test`}            ${`-language` `_`}
  -nobootcp            ${`-nobootcp test`}            ${`-nobootcp`}
  -no-specialization   ${`-no-specialization test`}   ${`-no-specialization`}
  -nowarn              ${`-nowarn test`}              ${`-nowarn`}
  -optimise            ${`-optimise test`}            ${`-optimise`}
  -print               ${`-print test`}               ${`-print`}
  -target              ${`-target test`}              ${`-target` jvm-1.8}
  -unchecked           ${`-unchecked test`}           ${`-unchecked`}
  -uniqid              ${`-uniqid test`}              ${`-uniqid`}
  -usejavacp           ${`-usejavacp test`}           ${`-usejavacp`}
  -usemanifestcp       ${`-usemanifestcp test`}       ${`-usemanifestcp`}
  -verbose             ${`-verbose test`}             ${`-verbose`}
  -version             ${`-version test`}             ${`-version`}
  -X                   ${`-X test`}                   ${`-X`}
"""

  def `-deprecation test` =
    `-deprecation` =>= "-deprecation"

  def `-encoding test` =
    (`-encoding` ASCII)           =>= "-encoding ASCII" and
    (`-encoding` UTF-8)           =>= "-encoding UTF-8" and
    (`-encoding` `ISO-8859-1`)    =>= "-encoding ISO-8859-1" and
    (`-encoding` custom "FooBar") =>= "-encoding FooBar"

  def `-explaintypes test` =
    `-explaintypes` =>= "-explaintypes"

  def `-feature test` =
    `-feature` =>= "-feature"

  def `-g test` =
    (`-g` none)          =>= "-g:none" and
    (`-g` source)        =>= "-g:source" and
    (`-g` line)          =>= "-g:line" and
    (`-g` vars)          =>= "-g:vars" and
    (`-g` notailcalls)   =>= "-g:notailcalls" and
    (`-g` custom "notc") =>= "-g:notc"

  def `-help test` =
    `-help` =>= "-help"

  def `-language test` =
    (`-language` `_`)                    =>= "-language:_" and
    (`-language` help)                   =>= "-language:help" and
    (`-language` dynamics)               =>= "-language:dynamics" and
    (`-language` `-dynamics`)            =>= "-language:-dynamics" and
    (`-language` postfixOps)             =>= "-language:postfixOps" and
    (`-language` `-postfixOps`)          =>= "-language:-postfixOps" and
    (`-language` reflectiveCalls)        =>= "-language:reflectiveCalls" and
    (`-language` `-reflectiveCalls`)     =>= "-language:-reflectiveCalls" and
    (`-language` implicitConversions)    =>= "-language:implicitConversions" and
    (`-language` `-implicitConversions`) =>= "-language:-implicitConversions" and
    (`-language` existentials)           =>= "-language:existentials" and
    (`-language` `-existentials`)        =>= "-language:-existentials" and
    (`-language` `experimental.macros`)  =>= "-language:experimental.macros" and
    (`-language` `-experimental.macros`) =>= "-language:-experimental.macros" and
    (`-language` custom "fooBar,-baz")   =>= "-language:fooBar,-baz"

  def `-nobootcp test` =
    `-nobootcp` =>= "-nobootcp"

  def `-no-specialization test` =
    `-no-specialization` =>= "-no-specialization"

  def `-nowarn test` =
    `-nowarn` =>= "-nowarn"

  def `-optimise test` =
    `-optimise` =>= "-optimise"

  def `-print test` =
    `-print` =>= "-print"

  def `-target test` =
    (`-target` `jvm-1.6`)     =>= "-target:jvm-1.6" and
    (`-target` jvm-1.7)       =>= "-target:jvm-1.7" and
    (`-target` custom "msil") =>= "-target:msil" and
    (`-target` custom "cldc") =>= "-target:cldc"

  def `-unchecked test` =
    `-unchecked` =>= "-unchecked"

  def `-uniqid test` =
    `-uniqid` =>= "-uniqid"

  def `-usejavacp test` =
    `-usejavacp` =>= "-usejavacp"

  def `-usemanifestcp test` =
    `-usemanifestcp` =>= "-usemanifestcp"

  def `-verbose test` =
    `-verbose` =>= "-verbose"

  def `-version test` =
    `-version` =>= "-version"

  def `-X test` =
    `-X` =>= "-X"
}
