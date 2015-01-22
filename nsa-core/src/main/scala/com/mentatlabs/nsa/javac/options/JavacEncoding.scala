package com.mentatlabs.nsa
package javac
package options

object JavacEncoding
    extends JavacOptionValueContainer[String]("-encoding")
    with shared.EncodingOptions
