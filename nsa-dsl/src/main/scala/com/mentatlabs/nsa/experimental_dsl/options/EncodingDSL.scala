package com.mentatlabs.nsa
package experimental_dsl

trait EncodingDSL extends ExperimentalDSL {
  object encoding {
    val unary_- = `-encoding`
  }

  implicit class PimpEncoding(e: `-encoding`.type) {
    /** Tongue-in-cheek implementation of an un-substractor which would allow for building the following DSL encodings:
      *   ISO-8859-1
      *   ISO-8859-2
      *   ISO-8859-3
      *   ISO-8859-4
      *   ISO-8859-5
      *   ISO-8859-6
      *   ISO-8859-7
      *   ISO-8859-8
      *   ISO-8859-9
      *   ISO-8859-11
      *   ISO-8859-13
      *   ISO-8859-15
      */
    def ISO(version: Int) = e custom ("ISO" + (
      if (version > -8875 && version < -8859) "-8859-" + (-8859 - version) else version
    ))
  }
}
