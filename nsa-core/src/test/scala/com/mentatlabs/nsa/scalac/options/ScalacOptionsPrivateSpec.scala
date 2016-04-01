package com.mentatlabs.nsa
package scalac
package options

class ScalacOptionsPrivateSpec extends ScalacOptionsSpec {
  def is = s2"""
  -Ybackend                          ${`-Ybackend test`}                          ${ScalacYBackend GenASM}
  -Ybreak-cycles                     ${`-Ybreak-cycles test`}                     ${ScalacYBreakCycles}
  -Yclosure-elim                     ${`-Yclosure-elim test`}                     ${ScalacYClosureElim}
  -Ycompact-trees                    ${`-Ycompact-trees test`}                    ${ScalacYCompactTrees}
  -Yconst-opt                        ${`-Yconst-opt test`}                        ${ScalacYConstOpt}
  -Ydead-code                        ${`-Ydead-code test`}                        ${ScalacYDeadCode}
  -Ydebug                            ${`-Ydebug test`}                            ${ScalacYDebug}
  -Ydelambdafy                       ${`-Ydelambdafy test`}                       ${ScalacYDelambdafy inline}
  -Ydisable-unreachable-prevention   ${`-Ydisable-unreachable-prevention test`}   ${ScalacYDisableUnreachablePrevention}
  -Yinline                           ${`-Yinline test`}                           ${ScalacYInline}
  -Yinline-handlers                  ${`-Yinline-handlers test`}                  ${ScalacYInlineHandlers}
  -Yinline-warnings                  ${`-Yinline-warnings test`}                  ${ScalacYInlineWarnings}
  -Yinfer-argument-types             ${`-Yinfer-argument-types test`}             ${ScalacYInferArgumentTypes}
  -Ylog-classpath                    ${`-Ylog-classpath test`}                    ${ScalacYLogClasspath}
  -Ymacro-debug-lite                 ${`-Ymacro-debug-lite test`}                 ${ScalacYMacroDebugLite}
  -Ymacro-debug-verbose              ${`-Ymacro-debug-verbose test`}              ${ScalacYMacroDebugVerbose}
  -Ymacro-expand                     ${`-Ymacro-expand test`}                     ${ScalacYMacroExpand normal}
  -Yno-adapted-args                  ${`-Yno-adapted-args test`}                  ${ScalacYNoAdaptedArgs}
  -Yno-completion                    ${`-Yno-completion test`}                    ${ScalacYNoCompletion}
  -Yno-generic-signatures            ${`-Yno-generic-signatures test`}            ${ScalacYNoGenericSignatures}
  -Yno-imports                       ${`-Yno-imports test`}                       ${ScalacYNoImports}
  -Yno-load-impl-class               ${`-Yno-load-impl-class test`}               ${ScalacYNoLoadImplClass}
  -Yno-predef                        ${`-Yno-predef test`}                        ${ScalacYNoPredef}
  -Ynooptimise                       ${`-Ynooptimise test`}                       ${ScalacYNooptimise}
  -Yopt                              ${`-Yopt test`}                              ${ScalacYOpt help}
  -Yoverride-objects                 ${`-Yoverride-objects test`}                 ${ScalacYOverrideObjects}
  -Yoverride-vars                    ${`-Yoverride-vars test`}                    ${ScalacYOverrideVars}
  -Ypresentation-strict              ${`-Ypresentation-strict test`}              ${ScalacYPresentationStrict}
  -Ypresentation-verbose             ${`-Ypresentation-verbose test`}             ${ScalacYPresentationVerbose}
  -Yrangepos                         ${`-Yrangepos test`}                         ${ScalacYRangepos}
  -Yreify-copypaste                  ${`-Yreify-copypaste test`}                  ${ScalacYReifyCopypaste}
  -Yrepl-class-based                 ${`-Yrepl-class-based test`}                 ${ScalacYReplClassBased}
  -Yrepl-sync                        ${`-Yrepl-sync test`}                        ${ScalacYReplSync}
  -Yresolve-term-conflict            ${`-Yresolve-term-conflict test`}            ${ScalacYResolveTermConflict error}
  -Yshow-symkinds                    ${`-Yshow-symkinds test`}                    ${ScalacYShowSymkinds}
  -Yshow-symowners                   ${`-Yshow-symowners test`}                   ${ScalacYShowSymowners}
  -Yshow-syms                        ${`-Yshow-syms test`}                        ${ScalacYShowSyms}
  -Yshow-trees                       ${`-Yshow-trees test`}                       ${ScalacYShowTrees}
  -Yshow-trees-compact               ${`-Yshow-trees-compact test`}               ${ScalacYShowTreesCompact}
  -Yshow-trees-stringified           ${`-Yshow-trees-stringified test`}           ${ScalacYShowTreesStringified}
  -Yskip                             ${`-Yskip test`}                             ${ScalacYSkip typer}
  -Ystatistics                       ${`-Ystatistics test`}                       ${ScalacYStatistics `_`}
  -Ystop-after                       ${`-Ystop-after test`}                       ${ScalacYStopAfter cleanup}
  -Ystop-before                      ${`-Ystop-before test`}                      ${ScalacYStopBefore erasure}
  -Ywarn-adapted-args                ${`-Ywarn-adapted-args test`}                ${ScalacYWarnAdaptedArgs}
  -Ywarn-dead-code                   ${`-Ywarn-dead-code test`}                   ${ScalacYWarnDeadCode}
  -Ywarn-inaccessible                ${`-Ywarn-inaccessible test`}                ${ScalacYWarnInaccessible}
  -Ywarn-infer-any                   ${`-Ywarn-infer-any test`}                   ${ScalacYWarnInferAny}
  -Ywarn-nullary-override            ${`-Ywarn-nullary-override test`}            ${ScalacYWarnNullaryOverride}
  -Ywarn-nullary-unit                ${`-Ywarn-nullary-unit test`}                ${ScalacYWarnNullaryUnit}
  -Ywarn-numeric-widen               ${`-Ywarn-numeric-widen test`}               ${ScalacYWarnNumericWiden}
  -Ywarn-unused                      ${`-Ywarn-unused test`}                      ${ScalacYWarnUnused}
  -Ywarn-unused-import               ${`-Ywarn-unused-import test`}               ${ScalacYWarnUnusedImport}
  -Ywarn-value-discard               ${`-Ywarn-value-discard test`}               ${ScalacYWarnValueDiscard}
"""

  def `-Ybackend test` =
    (ScalacYBackend GenASM)     =>= "-Ybackend:GenASM" and
    (ScalacYBackend GenBCode)   =>= "-Ybackend:GenBCode" and
    (ScalacYBackend ("FooBar")) =>= "-Ybackend:FooBar"

  def `-Ybreak-cycles test` =
    ScalacYBreakCycles =>= "-Ybreak-cycles"

  def `-Yclosure-elim test` =
    ScalacYClosureElim =>= "-Yclosure-elim"

  def `-Ycompact-trees test` =
    ScalacYCompactTrees =>= "-Ycompact-trees"

  def `-Yconst-opt test` =
    ScalacYConstOpt =>= "-Yconst-opt"

  def `-Ydead-code test` =
    ScalacYDeadCode =>= "-Ydead-code"

  def `-Ydebug test` =
    ScalacYDebug =>= "-Ydebug"

  def `-Ydelambdafy test` =
    (ScalacYDelambdafy inline)     =>= "-Ydelambdafy:inline" and
    (ScalacYDelambdafy method)     =>= "-Ydelambdafy:method" and
    (ScalacYDelambdafy ("FooBar")) =>= "-Ydelambdafy:FooBar"

  def `-Ydisable-unreachable-prevention test` =
    ScalacYDisableUnreachablePrevention =>= "-Ydisable-unreachable-prevention"

  def `-Yinline test` =
    ScalacYInline =>= "-Yinline"

  def `-Yinline-handlers test` =
    ScalacYInlineHandlers =>= "-Yinline-handlers"

  def `-Yinline-warnings test` =
    (ScalacYInlineWarnings)         =>= "-Yinline-warnings" and
    (ScalacYInlineWarnings `false`) =>= "-Yinline-warnings:false" and
    (ScalacYInlineWarnings (false)) =>= "-Yinline-warnings:false"

  def `-Yinfer-argument-types test` =
    ScalacYInferArgumentTypes =>= "-Yinfer-argument-types"

  def `-Ylog-classpath test` =
    ScalacYLogClasspath =>= "-Ylog-classpath"

  def `-Ymacro-debug-lite test` =
    ScalacYMacroDebugLite =>= "-Ymacro-debug-lite"

  def `-Ymacro-debug-verbose test` =
    ScalacYMacroDebugVerbose =>= "-Ymacro-debug-verbose"

  def `-Ymacro-expand test` =
    (ScalacYMacroExpand normal)     =>= "-Ymacro-expand:normal" and
    (ScalacYMacroExpand none)       =>= "-Ymacro-expand:none" and
    (ScalacYMacroExpand discard)    =>= "-Ymacro-expand:discard" and
    (ScalacYMacroExpand ("FooBar")) =>= "-Ymacro-expand:FooBar"

  def `-Yno-adapted-args test` =
    ScalacYNoAdaptedArgs =>= "-Yno-adapted-args"

  def `-Yno-completion test` =
    ScalacYNoCompletion =>= "-Yno-completion"

  def `-Yno-generic-signatures test` =
    ScalacYNoGenericSignatures =>= "-Yno-generic-signatures"

  def `-Yno-imports test` =
    ScalacYNoImports =>= "-Yno-imports"

  def `-Yno-load-impl-class test` =
    ScalacYNoLoadImplClass =>= "-Yno-load-impl-class"

  def `-Yno-predef test` =
    ScalacYNoPredef =>= "-Yno-predef"

  def `-Ynooptimise test` =
    ScalacYNooptimise =>= "-Ynooptimise"

  def `-Yopt test` =
    (ScalacYOpt `_`)                 =>= "-Yopt:_" and
    (ScalacYOpt help)                =>= "-Yopt:help" and
    (ScalacYOpt `unreachable-code`)  =>= "-Yopt:unreachable-code" and
    (ScalacYOpt `-unreachable-code`) =>= "-Yopt:-unreachable-code" and
    (ScalacYOpt `l:none`)            =>= "-Yopt:l:none" and
    (ScalacYOpt `-l:none`)           =>= "-Yopt:-l:none" and
    (ScalacYOpt `l:default`)         =>= "-Yopt:l:default" and
    (ScalacYOpt `l:method`)          =>= "-Yopt:l:method" and
    (ScalacYOpt `l:project`)         =>= "-Yopt:l:project" and
    (ScalacYOpt `l:classpath`)       =>= "-Yopt:l:classpath" and
    (ScalacYOpt  ("-Foo:Bar"))       =>= "-Yopt:-Foo:Bar"

  def `-Yoverride-objects test` =
    ScalacYOverrideObjects =>= "-Yoverride-objects"

  def `-Yoverride-vars test` =
    ScalacYOverrideVars =>= "-Yoverride-vars"

  def `-Ypresentation-strict test` =
    ScalacYPresentationStrict =>= "-Ypresentation-strict"

  def `-Ypresentation-verbose test` =
    ScalacYPresentationVerbose =>= "-Ypresentation-verbose"

  def `-Yrangepos test` =
    ScalacYRangepos =>= "-Yrangepos"

  def `-Yreify-copypaste test` =
    ScalacYReifyCopypaste =>= "-Yreify-copypaste"

  def `-Yrepl-class-based test` =
    ScalacYReplClassBased =>= "-Yrepl-class-based"

  def `-Yrepl-sync test` =
    ScalacYReplSync =>= "-Yrepl-sync"

  def `-Yresolve-term-conflict test` =
    (ScalacYResolveTermConflict `package`)  =>= "-Yresolve-term-conflict:package" and
    (ScalacYResolveTermConflict `object`)   =>= "-Yresolve-term-conflict:object" and
    (ScalacYResolveTermConflict error)      =>= "-Yresolve-term-conflict:error" and
    (ScalacYResolveTermConflict ("FooBar")) =>= "-Yresolve-term-conflict:FooBar"

  def `-Yshow-symkinds test` =
    ScalacYShowSymkinds =>= "-Yshow-symkinds"

  def `-Yshow-symowners test` =
    ScalacYShowSymowners =>= "-Yshow-symowners"

  def `-Yshow-syms test` =
    ScalacYShowSyms =>= "-Yshow-syms"

  def `-Yshow-trees test` =
    ScalacYShowTrees =>= "-Yshow-trees"

  def `-Yshow-trees-compact test` =
    ScalacYShowTreesCompact =>= "-Yshow-trees-compact"

  def `-Yshow-trees-stringified test` =
    ScalacYShowTreesStringified =>= "-Yshow-trees-stringified"

  def `-Yskip test` =
    (ScalacYSkip typer)      =>= "-Yskip:typer" and
    (ScalacYSkip patmat)     =>= "-Yskip:patmat" and
    (ScalacYSkip erasure)    =>= "-Yskip:erasure" and
    (ScalacYSkip cleanup)    =>= "-Yskip:cleanup" and
    (ScalacYSkip jvm)        =>= "-Yskip:jvm" and
    (ScalacYSkip ("FooBar")) =>= "-Yskip:FooBar"

  def `-Ystatistics test` =
    (ScalacYStatistics `_`)        =>= "-Ystatistics:_" and
    (ScalacYStatistics help)       =>= "-Ystatistics:help" and
    (ScalacYStatistics parser)     =>= "-Ystatistics:parser" and
    (ScalacYStatistics `-parser`)  =>= "-Ystatistics:-parser" and
    (ScalacYStatistics typer)      =>= "-Ystatistics:typer" and
    (ScalacYStatistics `-typer`)   =>= "-Ystatistics:-typer" and
    (ScalacYStatistics patmat)     =>= "-Ystatistics:patmat" and
    (ScalacYStatistics `-patmat`)  =>= "-Ystatistics:-patmat" and
    (ScalacYStatistics erasure)    =>= "-Ystatistics:erasure" and
    (ScalacYStatistics `-erasure`) =>= "-Ystatistics:-erasure" and
    (ScalacYStatistics cleanup)    =>= "-Ystatistics:cleanup" and
    (ScalacYStatistics `-cleanup`) =>= "-Ystatistics:-cleanup" and
    (ScalacYStatistics jvm)        =>= "-Ystatistics:jvm" and
    (ScalacYStatistics `-jvm`)     =>= "-Ystatistics:-jvm" and
    (ScalacYStatistics ("FooBar")) =>= "-Ystatistics:FooBar"

  def `-Ystop-after test` =
    (ScalacYStopAfter parser)     =>= "-Ystop-after:parser" and
    (ScalacYStopAfter typer)      =>= "-Ystop-after:typer" and
    (ScalacYStopAfter patmat)     =>= "-Ystop-after:patmat" and
    (ScalacYStopAfter erasure)    =>= "-Ystop-after:erasure" and
    (ScalacYStopAfter cleanup)    =>= "-Ystop-after:cleanup" and
    (ScalacYStopAfter jvm)        =>= "-Ystop-after:jvm" and
    (ScalacYStopAfter ("FooBar")) =>= "-Ystop-after:FooBar"

  def `-Ystop-before test` =
    (ScalacYStopBefore typer)      =>= "-Ystop-before:typer" and
    (ScalacYStopBefore patmat)     =>= "-Ystop-before:patmat" and
    (ScalacYStopBefore erasure)    =>= "-Ystop-before:erasure" and
    (ScalacYStopBefore cleanup)    =>= "-Ystop-before:cleanup" and
    (ScalacYStopBefore jvm)        =>= "-Ystop-before:jvm" and
    (ScalacYStopBefore ("FooBar")) =>= "-Ystop-before:FooBar"

  def `-Ywarn-adapted-args test` =
    ScalacYWarnAdaptedArgs =>= "-Ywarn-adapted-args"

  def `-Ywarn-dead-code test` =
    ScalacYWarnDeadCode =>= "-Ywarn-dead-code"

  def `-Ywarn-inaccessible test` =
    ScalacYWarnInaccessible =>= "-Ywarn-inaccessible"

  def `-Ywarn-infer-any test` =
    ScalacYWarnInferAny =>= "-Ywarn-infer-any"

  def `-Ywarn-nullary-override test` =
    ScalacYWarnNullaryOverride =>= "-Ywarn-nullary-override"

  def `-Ywarn-nullary-unit test` =
    ScalacYWarnNullaryUnit =>= "-Ywarn-nullary-unit"

  def `-Ywarn-numeric-widen test` =
    ScalacYWarnNumericWiden =>= "-Ywarn-numeric-widen"

  def `-Ywarn-unused test` =
    ScalacYWarnUnused =>= "-Ywarn-unused"

  def `-Ywarn-unused-import test` =
    ScalacYWarnUnusedImport =>= "-Ywarn-unused-import"

  def `-Ywarn-value-discard test` =
    ScalacYWarnValueDiscard =>= "-Ywarn-value-discard"
}
