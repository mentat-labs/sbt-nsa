package com.mentatlabs.nsa
package scalac
package options

/* -Xelide-below <n>
 * =================
 *     2.8.0 - 2.8.2: Generate calls to @elidable-marked methods only if method priority is greater than argument.
 *    2.9.0 - 2.12.0: Calls to @elidable methods are omitted if method priority is lower than argument
 */
object ScalacXElideBelow
    extends ScalacOptionValueContainer[Int]("-Xelide-below", ScalacVersions.`2.8.0`) {

  def ALL     = apply(Int.MinValue)
  def FINEST  = apply(300)
  def FINER   = apply(400)
  def FINE    = apply(500)
  def CONFIG  = apply(700)
  def INFO    = apply(800)
  def WARNING = apply(900)
  def SEVERE  = apply(1000)
  def OFF     = apply(Int.MaxValue)

  def MAXIMUM = OFF
  def MINIMUM = ALL

  def ASSERTION = apply(2000)
}
