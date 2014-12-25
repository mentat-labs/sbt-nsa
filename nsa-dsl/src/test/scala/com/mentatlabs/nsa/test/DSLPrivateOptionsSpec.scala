package com.mentatlabs.nsa.test

class DSLPrivateOptionsSpec extends DSLOptionsSpec {
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

  def `-Ybackend test` = new TypedScalacOptions { def options = Seq(
    -Ybackend GenASM         , "-Ybackend:GenASM"
  , -Ybackend GenBCode       , "-Ybackend:GenBCode"
  , -Ybackend custom "FooBar", "-Ybackend:FooBar"
  )}

  def `-Ybreak-cycles test` = new TypedScalacOptions { def options = Seq(
    -Ybreak-cycles, "-Ybreak-cycles"
  )}

  def `-Yclosure-elim test` = new TypedScalacOptions { def options = Seq(
    -Yclosure-elim, "-Yclosure-elim"
  )}

  def `-Ycompact-trees test` = new TypedScalacOptions { def options = Seq(
    -Ycompact-trees, "-Ycompact-trees"
  )}

  def `-Yconst-opt test` = new TypedScalacOptions { def options = Seq(
    -Yconst-opt, "-Yconst-opt"
  )}

  def `-Ydead-code test` = new TypedScalacOptions { def options = Seq(
    -Ydead-code, "-Ydead-code"
  )}

  def `-Ydebug test` = new TypedScalacOptions { def options = Seq(
    -Ydebug, "-Ydebug"
  )}

  def `-Ydelambdafy test` = new TypedScalacOptions { def options = Seq(
    -Ydelambdafy inline         , "-Ydelambdafy:inline"
  , -Ydelambdafy method         , "-Ydelambdafy:method"
  , -Ydelambdafy custom "FooBar", "-Ydelambdafy:FooBar"
  )}

  def `-Ydisable-unreachable-prevention test` = new TypedScalacOptions { def options = Seq(
    -Ydisable-unreachable-prevention, "-Ydisable-unreachable-prevention"
  )}

  def `-Yinline test` = new TypedScalacOptions { def options = Seq(
    -Yinline, "-Yinline"
  )}

  def `-Yinline-handlers test` = new TypedScalacOptions { def options = Seq(
    -Yinline-handlers, "-Yinline-handlers"
  )}

  def `-Yinline-warnings test` = new TypedScalacOptions { def options = Seq(
    -Yinline-warnings, "-Yinline-warnings"
  )}

  def `-Yinfer-argument-types test` = new TypedScalacOptions { def options = Seq(
    -Yinfer-argument-types, "-Yinfer-argument-types"
  )}

  def `-Ylog-classpath test` = new TypedScalacOptions { def options = Seq(
    -Ylog-classpath, "-Ylog-classpath"
  )}

  def `-Ymacro-debug-lite test` = new TypedScalacOptions { def options = Seq(
    -Ymacro-debug-lite, "-Ymacro-debug-lite"
  )}

  def `-Ymacro-debug-verbose test` = new TypedScalacOptions { def options = Seq(
    -Ymacro-debug-verbose, "-Ymacro-debug-verbose"
  )}

  def `-Ymacro-expand test` = new TypedScalacOptions { def options = Seq(
    -Ymacro-expand normal         , "-Ymacro-expand:normal"
  , -Ymacro-expand none           , "-Ymacro-expand:none"
  , -Ymacro-expand discard        , "-Ymacro-expand:discard"
  , -Ymacro-expand custom "FooBar", "-Ymacro-expand:FooBar"
  )}

  def `-Yno-adapted-args test` = new TypedScalacOptions { def options = Seq(
    -Yno-adapted-args, "-Yno-adapted-args"
  )}

  def `-Yno-completion test` = new TypedScalacOptions { def options = Seq(
    -Yno-completion, "-Yno-completion"
  )}

  def `-Yno-generic-signatures test` = new TypedScalacOptions { def options = Seq(
    -Yno-generic-signatures, "-Yno-generic-signatures"
  )}

  def `-Yno-imports test` = new TypedScalacOptions { def options = Seq(
    -Yno-imports, "-Yno-imports"
  )}

  def `-Yno-load-impl-class test` = new TypedScalacOptions { def options = Seq(
    -Yno-load-impl-`class`, "-Yno-load-impl-class"
  , -Yno-load-impl_class  , "-Yno-load-impl-class"
  )}

  def `-Yno-predef test` = new TypedScalacOptions { def options = Seq(
    -Yno-predef, "-Yno-predef"
  )}

  def `-Ynooptimise test` = new TypedScalacOptions { def options = Seq(
    -Ynooptimise, "-Ynooptimise"
  )}

  def `-Yopt test` = new TypedScalacOptions { def options = Seq(
    -Yopt `_`, "-Yopt:_"
  , -Yopt `help`, "-Yopt:help"
  , -Yopt `unreachable-code`, "-Yopt:unreachable-code"
  , -Yopt `-unreachable-code`, "-Yopt:-unreachable-code"
  , -Yopt `l:none`, "-Yopt:l:none"
  , -Yopt `-l:none`, "-Yopt:-l:none"
  , -Yopt `l:default`, "-Yopt:l:default"
  , -Yopt `l:method`, "-Yopt:l:method"
  , -Yopt `l:project`, "-Yopt:l:project"
  , -Yopt `l:classpath`, "-Yopt:l:classpath"
  , -Yopt custom "Foo:Bar", "-Yopt:Foo:Bar"
  , -Yopt custom "-Foo:Bar", "-Yopt:-Foo:Bar"
  )}

  def `-Yoverride-objects test` = new TypedScalacOptions { def options = Seq(
    -Yoverride-objects, "-Yoverride-objects"
  )}

  def `-Yoverride-vars test` = new TypedScalacOptions { def options = Seq(
    -Yoverride-vars, "-Yoverride-vars"
  )}

  def `-Ypresentation-strict test` = new TypedScalacOptions { def options = Seq(
    -Ypresentation-strict, "-Ypresentation-strict"
  )}

  def `-Ypresentation-verbose test` = new TypedScalacOptions { def options = Seq(
    -Ypresentation-verbose, "-Ypresentation-verbose"
  )}

  def `-Yrangepos test` = new TypedScalacOptions { def options = Seq(
    -Yrangepos, "-Yrangepos"
  )}

  def `-Yreify-copypaste test` = new TypedScalacOptions { def options = Seq(
    -Yreify-copypaste, "-Yreify-copypaste"
  )}

  def `-Yrepl-class-based test` = new TypedScalacOptions { def options = Seq(
    -Yrepl-`class`-based, "-Yrepl-class-based"
  , -Yrepl_class-based  , "-Yrepl-class-based"
  , -Yrepl-class_based  , "-Yrepl-class-based"
  )}

  def `-Yrepl-sync test` = new TypedScalacOptions { def options = Seq(
    -Yrepl-sync, "-Yrepl-sync"
  )}

  def `-Yresolve-term-conflict test` = new TypedScalacOptions { def options = Seq(
    -Yresolve-term-conflict `package`      , "-Yresolve-term-conflict:package"
  , -Yresolve-term-conflict `object`       , "-Yresolve-term-conflict:object"
  , -Yresolve-term-conflict error          , "-Yresolve-term-conflict:error"
  , -Yresolve-term-conflict custom "FooBar", "-Yresolve-term-conflict:FooBar"
  )}

  def `-Yshow-symkinds test` = new TypedScalacOptions { def options = Seq(
    -Yshow-symkinds, "-Yshow-symkinds"
  )}

  def `-Yshow-symowners test` = new TypedScalacOptions { def options = Seq(
    -Yshow-symowners, "-Yshow-symowners"
  )}

  def `-Yshow-syms test` = new TypedScalacOptions { def options = Seq(
    -Yshow-syms, "-Yshow-syms"
  )}

  def `-Yshow-trees test` = new TypedScalacOptions { def options = Seq(
    -Yshow-trees, "-Yshow-trees"
  )}

  def `-Yshow-trees-compact test` = new TypedScalacOptions { def options = Seq(
    -Yshow-trees-compact, "-Yshow-trees-compact"
  )}

  def `-Yshow-trees-stringified test` = new TypedScalacOptions { def options = Seq(
    -Yshow-trees-stringified, "-Yshow-trees-stringified"
  )}

  def `-Yskip test` = new TypedScalacOptions { def options = Seq(
      -Yskip `typer`  , "-Yskip:typer"
    , -Yskip `patmat` , "-Yskip:patmat"
    , -Yskip `erasure`, "-Yskip:erasure"
    , -Yskip `cleanup`, "-Yskip:cleanup"
    , -Yskip `jvm`    , "-Yskip:jvm"
    , -Yskip `FooBar` , "-Yskip:FooBar"
  )}

  def `-Ystatistics test` = new TypedScalacOptions { def options = Seq(
      -Ystatistics `_`       , "-Ystatistics:_"
    , -Ystatistics `help`    , "-Ystatistics:help"
    , -Ystatistics `parser`  , "-Ystatistics:parser"
    , -Ystatistics `-parser` , "-Ystatistics:-parser"
    , -Ystatistics `typer`   , "-Ystatistics:typer"
    , -Ystatistics `-typer`  , "-Ystatistics:-typer"
    , -Ystatistics `patmat`  , "-Ystatistics:patmat"
    , -Ystatistics `-patmat` , "-Ystatistics:-patmat"
    , -Ystatistics `erasure` , "-Ystatistics:erasure"
    , -Ystatistics `-erasure`, "-Ystatistics:-erasure"
    , -Ystatistics `cleanup` , "-Ystatistics:cleanup"
    , -Ystatistics `-cleanup`, "-Ystatistics:-cleanup"
    , -Ystatistics `jvm`     , "-Ystatistics:jvm"
    , -Ystatistics `-jvm`    , "-Ystatistics:-jvm"
    , -Ystatistics `FooBar`  , "-Ystatistics:FooBar"
    , -Ystatistics `-FooBar` , "-Ystatistics:-FooBar"
  )}

  def `-Ystop-after test` = new TypedScalacOptions { def options = Seq(
      -Ystop-after `parser` , "-Ystop-after:parser"
    , -Ystop-after `typer`  , "-Ystop-after:typer"
    , -Ystop-after `patmat` , "-Ystop-after:patmat"
    , -Ystop-after `erasure`, "-Ystop-after:erasure"
    , -Ystop-after `cleanup`, "-Ystop-after:cleanup"
    , -Ystop-after `jvm`    , "-Ystop-after:jvm"
    , -Ystop-after `FooBar` , "-Ystop-after:FooBar"
  )}

  def `-Ystop-before test` = new TypedScalacOptions { def options = Seq(
    -Ystop-before `typer`  , "-Ystop-before:typer"
  , -Ystop-before `patmat` , "-Ystop-before:patmat"
  , -Ystop-before `erasure`, "-Ystop-before:erasure"
  , -Ystop-before `cleanup`, "-Ystop-before:cleanup"
  , -Ystop-before `jvm`    , "-Ystop-before:jvm"
  , -Ystop-before `FooBar` , "-Ystop-before:FooBar"
  )}

  def `-Ywarn-adapted-args test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-adapted-args, "-Ywarn-adapted-args"
  )}

  def `-Ywarn-dead-code test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-dead-code, "-Ywarn-dead-code"
  )}

  def `-Ywarn-inaccessible test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-inaccessible, "-Ywarn-inaccessible"
  )}

  def `-Ywarn-infer-any test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-infer-any, "-Ywarn-infer-any"
  )}

  def `-Ywarn-nullary-override test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-nullary-`override`, "-Ywarn-nullary-override"
  , -Ywarn-nullary_override  , "-Ywarn-nullary-override"
  )}

  def `-Ywarn-nullary-unit test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-nullary-unit, "-Ywarn-nullary-unit"
  )}

  def `-Ywarn-numeric-widen test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-numeric-widen, "-Ywarn-numeric-widen"
  )}

  def `-Ywarn-unused test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-unused, "-Ywarn-unused"
  )}

  def `-Ywarn-unused-import test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-unused-`import`, "-Ywarn-unused-import"
  , -Ywarn-unused_import  , "-Ywarn-unused-import"
  )}

  def `-Ywarn-value-discard test` = new TypedScalacOptions { def options = Seq(
    -Ywarn-value-discard, "-Ywarn-value-discard"
  )}
}
