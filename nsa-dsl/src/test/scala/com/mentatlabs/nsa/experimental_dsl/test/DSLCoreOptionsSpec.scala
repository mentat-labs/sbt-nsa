package com.mentatlabs.nsa
package experimental_dsl
package test

class DSLCoreOptionsSpec extends DSLOptionSpec {
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
  -target              ${`-target test`}
  -unchecked           ${`-unchecked test`}
  -uniqid              ${`-uniqid test`}
  -usejavacp           ${`-usejavacp test`}
  -usemanifestcp       ${`-usemanifestcp test`}
  -verbose             ${`-verbose test`}
  -version             ${`-version test`}
  -X                   ${`-X test`}
"""

  def `-deprecation test` = new TypedScalacOptions { def options = Seq(
    -deprecation, "-deprecation"
  )}

  def `-encoding test` = new TypedScalacOptions { def options = Seq(
    -encoding ASCII          , ("-encoding", "ASCII")
  , -encoding UTF-8          , ("-encoding", "UTF-8")
  , -encoding `ISO-8859-1`   , ("-encoding", "ISO-8859-1")
  , -encoding custom "FooBar", ("-encoding", "FooBar")
  )}

  def `-explaintypes test` = new TypedScalacOptions { def options = Seq(
    -explaintypes, "-explaintypes"
  )}

  def `-feature test` = new TypedScalacOptions { def options = Seq(
    -feature, "-feature"
  )}

  def `-g test` = new TypedScalacOptions { def options = Seq(
    -g none         , "-g:none"
  , -g source       , "-g:source"
  , -g line         , "-g:line"
  , -g vars         , "-g:vars"
  , -g notailcalls  , "-g:notailcalls"
  , -g custom "notc", "-g:notc"
  )}

  def `-help test` = new TypedScalacOptions { def options = Seq(
    -help, "-help"
  )}

  def `-language test` = new TypedScalacOptions { def options = Seq(
    -language `_`                   , "-language:_"
  , -language help                  , "-language:help"
  , -language dynamics              , "-language:dynamics"
  , -language `-dynamics`           , "-language:-dynamics"
  , -language postfixOps            , "-language:postfixOps"
  , -language `-postfixOps`         , "-language:-postfixOps"
  , -language reflectiveCalls       , "-language:reflectiveCalls"
  , -language `-reflectiveCalls`    , "-language:-reflectiveCalls"
  , -language implicitConversions   , "-language:implicitConversions"
  , -language `-implicitConversions`, "-language:-implicitConversions"
  , -language existentials          , "-language:existentials"
  , -language `-existentials`       , "-language:-existentials"
  , -language `experimental.macros` , "-language:experimental.macros"
  , -language `-experimental.macros`, "-language:-experimental.macros"
  , -language custom "fooBar,-baz"  , "-language:fooBar,-baz"
  )}

  def `-nobootcp test` = new TypedScalacOptions { def options = Seq(
    -nobootcp, "-nobootcp"
  )}

  def `-no-specialization test` = new TypedScalacOptions { def options = Seq(
    -no-specialization, "-no-specialization"
  )}

  def `-nowarn test` = new TypedScalacOptions { def options = Seq(
    -nowarn, "-nowarn"
  )}

  def `-optimise test` = new TypedScalacOptions { def options = Seq(
    -optimise, "-optimise"
  )}

  def `-print test` = new TypedScalacOptions { def options = Seq(
    -print, "-print"
  )}

  def `-target test` = new TypedScalacOptions { def options = Seq(
    -target `jvm-1.6`    , "-target:jvm-1.6"
  , -target jvm-1.7      , "-target:jvm-1.7"
  , -target custom "msil", "-target:msil"
  , -target custom "cldc", "-target:cldc"
  )}

  def `-unchecked test` = new TypedScalacOptions { def options = Seq(
    -unchecked, "-unchecked"
  )}

  def `-uniqid test` = new TypedScalacOptions { def options = Seq(
    -uniqid, "-uniqid"
  )}

  def `-usejavacp test` = new TypedScalacOptions { def options = Seq(
    -usejavacp, "-usejavacp"
  )}

  def `-usemanifestcp test` = new TypedScalacOptions { def options = Seq(
    -usemanifestcp, "-usemanifestcp"
  )}

  def `-verbose test` = new TypedScalacOptions { def options = Seq(
    -verbose, "-verbose"
  )}

  def `-version test` = new TypedScalacOptions { def options = Seq(
    -version, "-version"
  )}

  def `-X test` = new TypedScalacOptions { def options = Seq(
    -X, "-X"
  )}
}
