package com.mentatlabs.nsa
package scalac
package dsl
package experimental

class ScalacOptionsDSLExperimentalPrivateSpec extends ScalacOptionsDSLExperimentalSpec {
  def is = s2"""
  -Ybackend                          ${`-Ybackend test`}
  -Ybreak-cycles                     ${`-Ybreak-cycles test`}
  -Yclosure-elim                     ${`-Yclosure-elim test`}
  -Ycompact-trees                    ${`-Ycompact-trees test`}
  -Yconst-opt                        ${`-Yconst-opt test`}
  -Ydead-code                        ${`-Ydead-code test`}
  -Ydebug                            ${`-Ydebug test`}
  -Ydelambdafy                       ${`-Ydelambdafy test`}
  -Ydisable-unreachable-prevention   ${`-Ydisable-unreachable-prevention test`}
  -Yinline                           ${`-Yinline test`}
  -Yinline-handlers                  ${`-Yinline-handlers test`}
  -Yinline-warnings                  ${`-Yinline-warnings test`}
  -Yinfer-argument-types             ${`-Yinfer-argument-types test`}
  -Ylog-classpath                    ${`-Ylog-classpath test`}
  -Ymacro-debug-lite                 ${`-Ymacro-debug-lite test`}
  -Ymacro-debug-verbose              ${`-Ymacro-debug-verbose test`}
  -Ymacro-expand                     ${`-Ymacro-expand test`}
  -Yno-adapted-args                  ${`-Yno-adapted-args test`}
  -Yno-completion                    ${`-Yno-completion test`}
  -Yno-generic-signatures            ${`-Yno-generic-signatures test`}
  -Yno-imports                       ${`-Yno-imports test`}
  -Yno-load-impl-class               ${`-Yno-load-impl-class test`}
  -Yno-predef                        ${`-Yno-predef test`}
  -Ynooptimise                       ${`-Ynooptimise test`}
  -Yopt                              ${`-Yopt test`}
  -Yoverride-objects                 ${`-Yoverride-objects test`}
  -Yoverride-vars                    ${`-Yoverride-vars test`}
  -Ypresentation-strict              ${`-Ypresentation-strict test`}
  -Ypresentation-verbose             ${`-Ypresentation-verbose test`}
  -Yrangepos                         ${`-Yrangepos test`}
  -Yreify-copypaste                  ${`-Yreify-copypaste test`}
  -Yrepl-class-based                 ${`-Yrepl-class-based test`}
  -Yrepl-sync                        ${`-Yrepl-sync test`}
  -Yresolve-term-conflict            ${`-Yresolve-term-conflict test`}
  -Yshow-symkinds                    ${`-Yshow-symkinds test`}
  -Yshow-symowners                   ${`-Yshow-symowners test`}
  -Yshow-syms                        ${`-Yshow-syms test`}
  -Yshow-trees                       ${`-Yshow-trees test`}
  -Yshow-trees-compact               ${`-Yshow-trees-compact test`}
  -Yshow-trees-stringified           ${`-Yshow-trees-stringified test`}
  -Yskip                             ${`-Yskip test`}
  -Ystatistics                       ${`-Ystatistics test`}
  -Ystop-after                       ${`-Ystop-after test`}
  -Ystop-before                      ${`-Ystop-before test`}
  -Ywarn-adapted-args                ${`-Ywarn-adapted-args test`}
  -Ywarn-dead-code                   ${`-Ywarn-dead-code test`}
  -Ywarn-inaccessible                ${`-Ywarn-inaccessible test`}
  -Ywarn-infer-any                   ${`-Ywarn-infer-any test`}
  -Ywarn-nullary-override            ${`-Ywarn-nullary-override test`}
  -Ywarn-nullary-unit                ${`-Ywarn-nullary-unit test`}
  -Ywarn-numeric-widen               ${`-Ywarn-numeric-widen test`}
  -Ywarn-unused                      ${`-Ywarn-unused test`}
  -Ywarn-unused-import               ${`-Ywarn-unused-import test`}
  -Ywarn-value-discard               ${`-Ywarn-value-discard test`}
"""

  def `-Ybackend test` = new CheckDSL { init (
    -Ybackend GenASM    , "-Ybackend:GenASM"
  , -Ybackend GenBCode  , "-Ybackend:GenBCode"
  , -Ybackend ("FooBar"), "-Ybackend:FooBar"
  )}

  def `-Ybreak-cycles test` = new CheckDSL { init (
    -Ybreak-cycles, "-Ybreak-cycles"
  )}

  def `-Yclosure-elim test` = new CheckDSL { init (
    -Yclosure-elim, "-Yclosure-elim"
  )}

  def `-Ycompact-trees test` = new CheckDSL { init (
    -Ycompact-trees, "-Ycompact-trees"
  )}

  def `-Yconst-opt test` = new CheckDSL { init (
    -Yconst-opt, "-Yconst-opt"
  )}

  def `-Ydead-code test` = new CheckDSL { init (
    -Ydead-code, "-Ydead-code"
  )}

  def `-Ydebug test` = new CheckDSL { init (
    -Ydebug, "-Ydebug"
  )}

  def `-Ydelambdafy test` = new CheckDSL { init (
    -Ydelambdafy inline    , "-Ydelambdafy:inline"
  , -Ydelambdafy method    , "-Ydelambdafy:method"
  , -Ydelambdafy ("FooBar"), "-Ydelambdafy:FooBar"
  )}

  def `-Ydisable-unreachable-prevention test` = new CheckDSL { init (
    -Ydisable-unreachable-prevention, "-Ydisable-unreachable-prevention"
  )}

  def `-Yinline test` = new CheckDSL { init (
    -Yinline, "-Yinline"
  )}

  def `-Yinline-handlers test` = new CheckDSL { init (
    -Yinline-handlers, "-Yinline-handlers"
  )}

  def `-Yinline-warnings test` = new CheckDSL { init (
    -Yinline-warnings, "-Yinline-warnings"
  )}

  def `-Yinfer-argument-types test` = new CheckDSL { init (
    -Yinfer-argument-types, "-Yinfer-argument-types"
  )}

  def `-Ylog-classpath test` = new CheckDSL { init (
    -Ylog-classpath, "-Ylog-classpath"
  )}

  def `-Ymacro-debug-lite test` = new CheckDSL { init (
    -Ymacro-debug-lite, "-Ymacro-debug-lite"
  )}

  def `-Ymacro-debug-verbose test` = new CheckDSL { init (
    -Ymacro-debug-verbose, "-Ymacro-debug-verbose"
  )}

  def `-Ymacro-expand test` = new CheckDSL { init (
    -Ymacro-expand normal    , "-Ymacro-expand:normal"
  , -Ymacro-expand none      , "-Ymacro-expand:none"
  , -Ymacro-expand discard   , "-Ymacro-expand:discard"
  , -Ymacro-expand ("FooBar"), "-Ymacro-expand:FooBar"
  )}

  def `-Yno-adapted-args test` = new CheckDSL { init (
    -Yno-adapted-args, "-Yno-adapted-args"
  )}

  def `-Yno-completion test` = new CheckDSL { init (
    -Yno-completion, "-Yno-completion"
  )}

  def `-Yno-generic-signatures test` = new CheckDSL { init (
    -Yno-generic-signatures, "-Yno-generic-signatures"
  )}

  def `-Yno-imports test` = new CheckDSL { init (
    -Yno-imports, "-Yno-imports"
  )}

  def `-Yno-load-impl-class test` = new CheckDSL { init (
    -Yno-load-impl-`class`, "-Yno-load-impl-class"
  , -Yno-load-impl_class  , "-Yno-load-impl-class"
  )}

  def `-Yno-predef test` = new CheckDSL { init (
    -Yno-predef, "-Yno-predef"
  )}

  def `-Ynooptimise test` = new CheckDSL { init (
    -Ynooptimise, "-Ynooptimise"
  )}

  def `-Yopt test` = new CheckDSL { init (
    -Yopt `_`                ,             "-Yopt:_"
    , -Yopt `help`, "-Yopt:help"
  , -Yopt `unreachable-code`, "-Yopt:unreachable-code"
  , -Yopt `-unreachable-code`, "-Yopt:-unreachable-code"
  , -Yopt `l:none`, "-Yopt:l:none"
  , -Yopt `-l:none`, "-Yopt:-l:none"
  , -Yopt `l:default`, "-Yopt:l:default"
  , -Yopt `l:method`, "-Yopt:l:method"
  , -Yopt `l:project`, "-Yopt:l:project"
  , -Yopt `l:classpath`, "-Yopt:l:classpath"
  , -Yopt ("Foo:Bar"), "-Yopt:Foo:Bar"
  , -Yopt ("-Foo:Bar"), "-Yopt:-Foo:Bar"
  )}

  def `-Yoverride-objects test` = new CheckDSL { init (
    -Yoverride-objects, "-Yoverride-objects"
  )}

  def `-Yoverride-vars test` = new CheckDSL { init (
    -Yoverride-vars, "-Yoverride-vars"
  )}

  def `-Ypresentation-strict test` = new CheckDSL { init (
    -Ypresentation-strict, "-Ypresentation-strict"
  )}

  def `-Ypresentation-verbose test` = new CheckDSL { init (
    -Ypresentation-verbose, "-Ypresentation-verbose"
  )}

  def `-Yrangepos test` = new CheckDSL { init (
    -Yrangepos, "-Yrangepos"
  )}

  def `-Yreify-copypaste test` = new CheckDSL { init (
    -Yreify-copypaste, "-Yreify-copypaste"
  )}

  def `-Yrepl-class-based test` = new CheckDSL { init (
    -Yrepl-`class`-based, "-Yrepl-class-based"
  , -Yrepl_class-based  , "-Yrepl-class-based"
  , -Yrepl-class_based  , "-Yrepl-class-based"
  )}

  def `-Yrepl-sync test` = new CheckDSL { init (
    -Yrepl-sync, "-Yrepl-sync"
  )}

  def `-Yresolve-term-conflict test` = new CheckDSL { init (
    -Yresolve-term-conflict `package` , "-Yresolve-term-conflict:package"
  , -Yresolve-term-conflict `object`  , "-Yresolve-term-conflict:object"
  , -Yresolve-term-conflict error     , "-Yresolve-term-conflict:error"
  , -Yresolve-term-conflict ("FooBar"), "-Yresolve-term-conflict:FooBar"
  )}

  def `-Yshow-symkinds test` = new CheckDSL { init (
    -Yshow-symkinds, "-Yshow-symkinds"
  )}

  def `-Yshow-symowners test` = new CheckDSL { init (
    -Yshow-symowners, "-Yshow-symowners"
  )}

  def `-Yshow-syms test` = new CheckDSL { init (
    -Yshow-syms, "-Yshow-syms"
  )}

  def `-Yshow-trees test` = new CheckDSL { init (
    -Yshow-trees, "-Yshow-trees"
  )}

  def `-Yshow-trees-compact test` = new CheckDSL { init (
    -Yshow-trees-compact, "-Yshow-trees-compact"
  )}

  def `-Yshow-trees-stringified test` = new CheckDSL { init (
    -Yshow-trees-stringified, "-Yshow-trees-stringified"
  )}

  def `-Yskip test` = new CheckDSL { init (
      -Yskip typer     , "-Yskip:typer"
    , -Yskip patmat    , "-Yskip:patmat"
    , -Yskip erasure   , "-Yskip:erasure"
    , -Yskip cleanup   , "-Yskip:cleanup"
    , -Yskip jvm       , "-Yskip:jvm"
    , -Yskip ("FooBar"), "-Yskip:FooBar"
  )}

  def `-Ystatistics test` = new CheckDSL { init (
      -Ystatistics `_`       , "-Ystatistics:_"
    , -Ystatistics help      , "-Ystatistics:help"
    , -Ystatistics parser    , "-Ystatistics:parser"
    , -Ystatistics `-parser` , "-Ystatistics:-parser"
    , -Ystatistics typer     , "-Ystatistics:typer"
    , -Ystatistics `-typer`  , "-Ystatistics:-typer"
    , -Ystatistics patmat    , "-Ystatistics:patmat"
    , -Ystatistics `-patmat` , "-Ystatistics:-patmat"
    , -Ystatistics erasure   , "-Ystatistics:erasure"
    , -Ystatistics `-erasure`, "-Ystatistics:-erasure"
    , -Ystatistics cleanup   , "-Ystatistics:cleanup"
    , -Ystatistics `-cleanup`, "-Ystatistics:-cleanup"
    , -Ystatistics jvm       , "-Ystatistics:jvm"
    , -Ystatistics `-jvm`    , "-Ystatistics:-jvm"
    , -Ystatistics ("FooBar"), "-Ystatistics:FooBar"
  )}

  def `-Ystop-after test` = new CheckDSL { init (
      -Ystop-after parser    , "-Ystop-after:parser"
    , -Ystop-after typer     , "-Ystop-after:typer"
    , -Ystop-after patmat    , "-Ystop-after:patmat"
    , -Ystop-after erasure   , "-Ystop-after:erasure"
    , -Ystop-after cleanup   , "-Ystop-after:cleanup"
    , -Ystop-after jvm       , "-Ystop-after:jvm"
    , -Ystop-after ("FooBar"), "-Ystop-after:FooBar"
  )}

  def `-Ystop-before test` = new CheckDSL { init (
    -Ystop-before typer     , "-Ystop-before:typer"
  , -Ystop-before patmat    , "-Ystop-before:patmat"
  , -Ystop-before erasure   , "-Ystop-before:erasure"
  , -Ystop-before cleanup   , "-Ystop-before:cleanup"
  , -Ystop-before jvm       , "-Ystop-before:jvm"
  , -Ystop-before ("FooBar"), "-Ystop-before:FooBar"
  )}

  def `-Ywarn-adapted-args test` = new CheckDSL { init (
    -Ywarn-adapted-args, "-Ywarn-adapted-args"
  )}

  def `-Ywarn-dead-code test` = new CheckDSL { init (
    -Ywarn-dead-code, "-Ywarn-dead-code"
  )}

  def `-Ywarn-inaccessible test` = new CheckDSL { init (
    -Ywarn-inaccessible, "-Ywarn-inaccessible"
  )}

  def `-Ywarn-infer-any test` = new CheckDSL { init (
    -Ywarn-infer-any, "-Ywarn-infer-any"
  )}

  def `-Ywarn-nullary-override test` = new CheckDSL { init (
    -Ywarn-nullary-`override`, "-Ywarn-nullary-override"
  , -Ywarn-nullary_override  , "-Ywarn-nullary-override"
  )}

  def `-Ywarn-nullary-unit test` = new CheckDSL { init (
    -Ywarn-nullary-unit, "-Ywarn-nullary-unit"
  )}

  def `-Ywarn-numeric-widen test` = new CheckDSL { init (
    -Ywarn-numeric-widen, "-Ywarn-numeric-widen"
  )}

  def `-Ywarn-unused test` = new CheckDSL { init (
    -Ywarn-unused, "-Ywarn-unused"
  )}

  def `-Ywarn-unused-import test` = new CheckDSL { init (
    -Ywarn-unused-`import`, "-Ywarn-unused-import"
  , -Ywarn-unused_import  , "-Ywarn-unused-import"
  )}

  def `-Ywarn-value-discard test` = new CheckDSL { init (
    -Ywarn-value-discard, "-Ywarn-value-discard"
  )}
}
