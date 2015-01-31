package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacOptionsDSL {
  // core options
  val `-deprecation`                     = ScalacDeprecation
  val `-encoding`                        = ScalacEncoding
  val `-explaintypes`                    = ScalacExplaintypes
  val `-feature`                         = ScalacFeature
  val `-g`                               = ScalacG
  val `-help`                            = ScalacHelp
  val `-language`                        = ScalacLanguage
  val `-no-specialization`               = ScalacNoSpecialization
  val `-nobootcp`                        = ScalacNobootcp
  val `-nowarn`                          = ScalacNowarn
  val `-optimise`                        = ScalacOptimise
  val `-print`                           = ScalacPrint
  val `-sourcepath`                      = ScalacSourcepath
  val `-target`                          = ScalacTarget
  val `-unchecked`                       = ScalacUnchecked
  val `-uniqid`                          = ScalacUniqid
  val `-usejavacp`                       = ScalacUsejavacp
  val `-usemanifestcp`                   = ScalacUsemanifestcp
  val `-verbose`                         = ScalacVerbose
  val `-version`                         = ScalacVersion
  val `-X`                               = ScalacX

  // advanced options
  val `-Xcheckinit`                      = ScalacXCheckinit
  val `-Xdev`                            = ScalacXDev
  val `-Xdisable-assertions`             = ScalacXDisableAssertions
  val `-Xelide-below`                    = ScalacXElideBelow
  val `-Xexperimental`                   = ScalacXExperimental
  val `-Xfatal-warnings`                 = ScalacXFatalWarnings
  val `-Xfull-lubs`                      = ScalacXFullLubs
  val `-Xfuture`                         = ScalacXFuture
  val `-Xlint`                           = ScalacXLint
  val `-Xlog-free-terms`                 = ScalacXLogFreeTerms
  val `-Xlog-free-types`                 = ScalacXLogFreeTypes
  val `-Xlog-implicit-conversions`       = ScalacXLogImplicitConversions
  val `-Xlog-implicits`                  = ScalacXLogImplicits
  val `-Xlog-reflective-calls`           = ScalacXLogReflectiveCalls
  val `-Xmax-classfile-name`             = ScalacXMaxClassfileName
  val `-Xno-forwarders`                  = ScalacXNoForwarders
  val `-Xnojline`                        = ScalacXNojline
  val `-Xno-patmat-analysis`             = ScalacXNoPatmatAnalysis
  val `-Xno-uescape`                     = ScalacXNoUescape
  val `-Xplugin-list`                    = ScalacXPluginList
  val `-Xprint-pos`                      = ScalacXPrintPos
  val `-Xprint-types`                    = ScalacXPrintTypes
  val `-Xprompt`                         = ScalacXPrompt
  val `-Xresident`                       = ScalacXResident
  val `-Xshow-phases`                    = ScalacXShowPhases
  val `-Xsource`                         = ScalacXSource
  val `-Xstrict-inference`               = ScalacXStrictInference
  val `-Xverify`                         = ScalacXVerify
  val `-Y`                               = ScalacY

  // private options
  val `-Ybackend`                        = ScalacYBackend
  val `-Ybreak-cycles`                   = ScalacYBreakCycles
  val `-Yclosure-elim`                   = ScalacYClosureElim
  val `-Ycompact-trees`                  = ScalacYCompactTrees
  val `-Yconst-opt`                      = ScalacYConstOpt
  val `-Ydead-code`                      = ScalacYDeadCode
  val `-Ydebug`                          = ScalacYDebug
  val `-Ydelambdafy`                     = ScalacYDelambdafy
  val `-Ydisable-unreachable-prevention` = ScalacYDisableUnreachablePrevention
  val `-Yinline`                         = ScalacYInline
  val `-Yinline-handlers`                = ScalacYInlineHandlers
  val `-Yinline-warnings`                = ScalacYInlineWarnings
  val `-Yinfer-argument-types`           = ScalacYInferArgumentTypes
  val `-Ylog-classpath`                  = ScalacYLogClasspath
  val `-Ymacro-debug-lite`               = ScalacYMacroDebugLite
  val `-Ymacro-debug-verbose`            = ScalacYMacroDebugVerbose
  val `-Ymacro-expand`                   = ScalacYMacroExpand
  val `-Yno-adapted-args`                = ScalacYNoAdaptedArgs
  val `-Yno-completion`                  = ScalacYNoCompletion
  val `-Yno-generic-signatures`          = ScalacYNoGenericSignatures
  val `-Yno-imports`                     = ScalacYNoImports
  val `-Yno-load-impl-class`             = ScalacYNoLoadImplClass
  val `-Yno-predef`                      = ScalacYNoPredef
  val `-Ynooptimise`                     = ScalacYNooptimise
  val `-Yopt`                            = ScalacYOpt
  val `-Yoverride-objects`               = ScalacYOverrideObjects
  val `-Yoverride-vars`                  = ScalacYOverrideVars
  val `-Ypresentation-strict`            = ScalacYPresentationStrict
  val `-Ypresentation-verbose`           = ScalacYPresentationVerbose
  val `-Yrangepos`                       = ScalacYRangepos
  val `-Yreify-copypaste`                = ScalacYReifyCopypaste
  val `-Yrepl-class-based`               = ScalacYReplClassBased
  val `-Yrepl-sync`                      = ScalacYReplSync
  val `-Yresolve-term-conflict`          = ScalacYResolveTermConflict
  val `-Yshow-symkinds`                  = ScalacYShowSymkinds
  val `-Yshow-symowners`                 = ScalacYShowSymowners
  val `-Yshow-syms`                      = ScalacYShowSyms
  val `-Yshow-trees`                     = ScalacYShowTrees
  val `-Yshow-trees-compact`             = ScalacYShowTreesCompact
  val `-Yshow-trees-stringified`         = ScalacYShowTreesStringified
  val `-Yskip`                           = ScalacYSkip
  val `-Ystatistics`                     = ScalacYStatistics
  val `-Ystop-after`                     = ScalacYStopAfter
  val `-Ystop-before`                    = ScalacYStopBefore
  val `-Ywarn-adapted-args`              = ScalacYWarnAdaptedArgs
  val `-Ywarn-dead-code`                 = ScalacYWarnDeadCode
  val `-Ywarn-inaccessible`              = ScalacYWarnInaccessible
  val `-Ywarn-infer-any`                 = ScalacYWarnInferAny
  val `-Ywarn-nullary-override`          = ScalacYWarnNullaryOverride
  val `-Ywarn-nullary-unit`              = ScalacYWarnNullaryUnit
  val `-Ywarn-numeric-widen`             = ScalacYWarnNumericWiden
  val `-Ywarn-unused`                    = ScalacYWarnUnused
  val `-Ywarn-unused-import`             = ScalacYWarnUnusedImport
  val `-Ywarn-value-discard`             = ScalacYWarnValueDiscard

  // private additional options
  val `-Ydoc-debug`                      = ScalacYDocDebug
  val `-Yide-debug`                      = ScalacYIdeDebug
  val `-Yissue-debug`                    = ScalacYIssueDebug
  val `-Ypatmat-debug`                   = ScalacYPatmatDebug
  val `-Ypos-debug`                      = ScalacYPosDebug
  val `-Ypresentation-debug`             = ScalacYPresentationDebug
  val `-Yquasiquote-debug`               = ScalacYQuasiquoteDebug
  val `-Yreify-debug`                    = ScalacYReifyDebug
  val `-Ytyper-debug`                    = ScalacYTyperDebug

  // private deprecated options
  val `-Yeta-expand-keeps-star`          = ScalacYEtaExpandKeepsStar
  val `-Yinfer-by-name`                  = ScalacYInferByName
  val `-Yinfer-debug`                    = ScalacYInferDebug
  val `-Ymacro-no-expand`                = ScalacYMacroNoExpand
}
