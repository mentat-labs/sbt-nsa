package com.mentatlabs.nsa
package scalac
package options

/** -Ydelambdafy:<strategy>
  * =======================
  *   2.11.0 - 2.12.0: Strategy used for translating lambdas into JVM code. (inline,method) default:inline
  */
object ScalacYDelambdafy
    extends ScalacOptionChoiceContainer[String]("-Ydelambdafy", ScalacVersions.`2.11.0`) {

  def inline = apply("inline")
  def method = apply("method")
}
