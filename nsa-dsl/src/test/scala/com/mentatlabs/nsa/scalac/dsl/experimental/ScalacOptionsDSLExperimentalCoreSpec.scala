package com.mentatlabs.nsa
package scalac
package dsl
package experimental

import java.nio.charset.Charset

class ScalacOptionsDSLExperimentalCoreSpec extends ScalacOptionsDSLExperimentalSpec {
  def is = s2"""
  -deprecation         ${`-deprecation test`}
  -encoding            ${`-encoding test`}
  -explaintypes        ${`-explaintypes test`}
  -feature             ${`-feature test`}
  -g                   ${`-g test`}
  -help                ${`-help test`}
  -language            ${`-language test`}
  -nobootcp            ${`-nobootcp test`}
  -no-specialization   ${`-no-specialization test`}
  -nowarn              ${`-nowarn test`}
  -optimise            ${`-optimise test`}
  -print               ${`-print test`}
  -sourcepath          ${`-sourcepath test`}
  -target              ${`-target test`}
  -unchecked           ${`-unchecked test`}
  -uniqid              ${`-uniqid test`}
  -usejavacp           ${`-usejavacp test`}
  -usemanifestcp       ${`-usemanifestcp test`}
  -verbose             ${`-verbose test`}
  -version             ${`-version test`}
  -X                   ${`-X test`}
"""

  def `-deprecation test` = new CheckDSL { init (
    -deprecation        , "-deprecation"
  , -deprecation `false`, "-deprecation:false"
  , -deprecation (false), "-deprecation:false"
  )}

  def `-encoding test` = new CheckDSL { init (
    -encoding ASCII                 , ("-encoding", "ASCII")
  , -encoding UTF-8                 , ("-encoding", "UTF-8")
  , -encoding ISO-8859-1            , ("-encoding", "ISO-8859-1")
  , -encoding ("FooBar")            , ("-encoding", "FooBar")
  , -encoding (Charset forName "L1"), ("-encoding", "ISO-8859-1")
  )}

  def `-explaintypes test` = new CheckDSL { init (
    -explaintypes, "-explaintypes"
  )}

  def `-feature test` = new CheckDSL { init (
    -feature, "-feature"
  )}

  def `-g test` = new CheckDSL { init (
    -g none       , "-g:none"
  , -g source     , "-g:source"
  , -g line       , "-g:line"
  , -g vars       , "-g:vars"
  , -g notailcalls, "-g:notailcalls"
  , -g ("notc")   , "-g:notc"
  )}

  def `-help test` = new CheckDSL { init (
    -help, "-help"
  )}

  def `-language test` = new CheckDSL { init (
    -language `_`                     , "-language:_"
  , -language help                    , "-language:help"
  , -language dynamics                , "-language:dynamics"
  , -language (dynamics)              , "-language:dynamics"
  , -language `-dynamics`             , "-language:-dynamics"
  , -language (`-dynamics`)           , "-language:-dynamics"
  , -language (-dynamics)             , "-language:-dynamics"
  , -language postfixOps              , "-language:postfixOps"
  , -language (postfixOps)            , "-language:postfixOps"
  , -language `-postfixOps`           , "-language:-postfixOps"
  , -language (`-postfixOps`)         , "-language:-postfixOps"
  , -language (-postfixOps)           , "-language:-postfixOps"
  , -language reflectiveCalls         , "-language:reflectiveCalls"
  , -language (reflectiveCalls)       , "-language:reflectiveCalls"
  , -language `-reflectiveCalls`      , "-language:-reflectiveCalls"
  , -language (`-reflectiveCalls`)    , "-language:-reflectiveCalls"
  , -language (-reflectiveCalls)      , "-language:-reflectiveCalls"
  , -language implicitConversions     , "-language:implicitConversions"
  , -language (implicitConversions)   , "-language:implicitConversions"
  , -language `-implicitConversions`  , "-language:-implicitConversions"
  , -language (`-implicitConversions`), "-language:-implicitConversions"
  , -language (-implicitConversions)  , "-language:-implicitConversions"
  , -language existentials            , "-language:existentials"
  , -language (existentials)          , "-language:existentials"
  , -language `-existentials`         , "-language:-existentials"
  , -language (`-existentials`)       , "-language:-existentials"
  , -language (-existentials)         , "-language:-existentials"
  , -language `experimental.macros`   , "-language:experimental.macros"
  , -language (`experimental.macros`) , "-language:experimental.macros"
  , -language (experimental.macros)   , "-language:experimental.macros"
  , -language `-experimental.macros`  , "-language:-experimental.macros"
  , -language (`-experimental.macros`), "-language:-experimental.macros"
  , -language (-experimental.macros)  , "-language:-experimental.macros"
  , -language ("fooBar,-baz")         , "-language:fooBar,-baz"
  , -language (dynamics,-postfixOps)  , "-language:dynamics,-postfixOps"
  )}

  def `-nobootcp test` = new CheckDSL { init (
    -nobootcp, "-nobootcp"
  )}

  def `-no-specialization test` = new CheckDSL { init (
    -no-specialization, "-no-specialization"
  )}

  def `-nowarn test` = new CheckDSL { init (
    -nowarn, "-nowarn"
  )}

  def `-optimise test` = new CheckDSL { init (
    -optimise, "-optimise"
  )}

  def `-print test` = new CheckDSL { init (
    -print, "-print"
  )}

  def `-sourcepath test` = new CheckDSL { init (
    -sourcepath ("/a/b"), ("-sourcepath", s"${FS}a${FS}b")
  )}

  def `-target test` = new CheckDSL { init (
    -target `jvm-1.6`, "-target:jvm-1.6"
  , -target jvm-1.7  , "-target:jvm-1.7"
  , -target ("msil") , "-target:msil"
  , -target ("cldc") , "-target:cldc"
  )}

  def `-unchecked test` = new CheckDSL { init (
    -unchecked, "-unchecked"
  )}

  def `-uniqid test` = new CheckDSL { init (
    -uniqid, "-uniqid"
  )}

  def `-usejavacp test` = new CheckDSL { init (
    -usejavacp, "-usejavacp"
  )}

  def `-usemanifestcp test` = new CheckDSL { init (
    -usemanifestcp, "-usemanifestcp"
  )}

  def `-verbose test` = new CheckDSL { init (
    -verbose, "-verbose"
  )}

  def `-version test` = new CheckDSL { init (
    -version, "-version"
  )}

  def `-X test` = new CheckDSL { init (
    -X, "-X"
  )}
}
