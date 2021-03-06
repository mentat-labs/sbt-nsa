package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait BooleanProxy {
  def apply(value: Boolean) = new WithBoolean(value)
  class WithBoolean(val value: Boolean)
}

trait IntProxy {
  def apply(value: Int) = new WithInt(value)
  class WithInt(val value: Int)
}

trait StringProxy {
  def apply(value: String) = new WithString(value)
  class WithString(val value: String)
}

// TODO: better way to defeat StringProxy#WithString conflict after erasure
trait StringProxy2 {
  def apply(value: String) = new WithString2(value)
  class WithString2(val value: String)
}

trait ScalacExperimentalDSL {
  object adapted
  object after extends StringProxy
  object analysis
  object any
  object args
  object argument
  object assertions
  object based
  object before extends StringProxy2
  object below extends IntProxy
  object by
  object calls
  object `class`
  object class_based
  object classfile
  object classpath
  object code
  object compact
  object completion
  object conflict extends StringProxy
  object conversions
  object copypaste
  object cycles
  object dead
  object debug
  object discard
  object elim
  object expand extends StringProxy
  object forwarders
  object free
  object generic
  object handlers
  object impl
  object impl_class
  object `implicit`
  object implicit_conversions
  object implicits
  object `import`
  object imports
  object inaccessible
  object infer
  object inference
  object keeps
  object list
  object lite
  object load
  object lubs
  object name extends IntProxy
  object nullary
  object nullary_override
  object numeric
  object objects
  object opt
  object `override`
  object patmat
  object phases
  object pos
  object predef
  object prevention
  object reflective
  object signatures
  object specialization
  object star
  object strict
  object stringified
  object symkinds
  object symowners
  object syms
  object sync
  object term
  object terms
  object trees
  object types
  object uescape
  object unit
  object unreachable
  object unused
  object unused_import
  object value
  object vars
  object warnings
  object widen
}
