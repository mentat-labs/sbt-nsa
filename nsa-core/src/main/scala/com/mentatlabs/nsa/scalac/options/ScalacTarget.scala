package com.mentatlabs.nsa
package scalac
package options

import javac.JavacVersion

/* -target:<target>
 * ================
 *     2.0.0 - 2.1.4: Specify which backend to use (jvm,msil)
 *     2.1.5 - 2.5.1: Specify which backend to use (jvm-1.5,jvm-1.4,msil,cldc)
 *     2.6.0 - 2.7.1: Specify for which target object files should be built (jvm-1.5,jvm-1.4,msil,cldc)
 *     2.7.2 - 2.7.7: Specify for which target object files should be built (jvm-1.5,jvm-1.4,msil)
 *     2.8.0 - 2.8.2: Specify for which target object files should be built (jvm-1.5,msil)
 *     2.9.0 - 2.9.3: Target platform for object files. (jvm-1.5,msil) default:jvm-1.5
 *   2.10.0 - 2.10.6: Target platform for object files. All JVM 1.5 targets are deprecated. (jvm-1.5,jvm-1.5-fjbg,jvm-1.5-asm,jvm-1.6,jvm-1.7,msil) default:jvm-1.6
 *   2.11.0 - 2.11.2: Target platform for object files. All JVM 1.5 targets are deprecated. (jvm-1.5,jvm-1.6,jvm-1.7) default:jvm-1.6
 *   2.11.3 - 2.11.8: Target platform for object files. All JVM 1.5 targets are deprecated. (jvm-1.5,jvm-1.6,jvm-1.7,jvm-1.8) default:jvm-1.6
 *            2.12.0: Target platform for object files. All JVM 1.5 - 1.7 targets are deprecated. (jvm-1.5,jvm-1.6,jvm-1.7,jvm-1.8) default:jvm-1.8
 */
object ScalacTarget
    extends ScalacOptionChoiceContainer[String]("-target", ScalacVersions.`2.0.0`) {

  // FIXME: <1.6 are deprecated in new Scalac versions
  // FIXME: <1.7 are removed in new Scalac versions
  def jvm(version: Double) = apply("jvm" + version)

  def `jvm-1.4` = apply("jvm-1.4")
  def `jvm-1.5` = apply("jvm-1.5")
  def `jvm-1.6` = apply("jvm-1.6")
  def `jvm-1.7` = apply("jvm-1.7")
  def `jvm-1.8` = apply("jvm-1.8")

  def apply(javac: JavacVersion): ScalacOptionChoice[String] =
    apply("jvm" + javac)
}
