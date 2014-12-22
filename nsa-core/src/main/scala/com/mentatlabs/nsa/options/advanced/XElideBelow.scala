package com.mentatlabs.nsa

/** Calls to @elidable methods are omitted if method priority is lower than argumentEnable experimental extensions. */
object `-Xelide-below` {
  private val since = ScalacVersion.`2.8.0`

  case class custom(n: Int)
      extends ValueOption("-Xelide-below", n) {
    val since = `-Xelide-below`.since
  }

  def ALL     = custom(Int.MinValue)
  def FINEST  = custom(300)
  def FINER   = custom(400)
  def FINE    = custom(500)
  def CONFIG  = custom(700)
  def INFO    = custom(800)
  def WARNING = custom(900)
  def SEVERE  = custom(1000)
  def OFF     = custom(Int.MaxValue)

  def MAXIMUM = OFF
  def MINIMUM = ALL

  def ASSERTION = custom(2000)
}
