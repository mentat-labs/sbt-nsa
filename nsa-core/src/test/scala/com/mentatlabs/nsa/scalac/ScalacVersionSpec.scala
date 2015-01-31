package com.mentatlabs.nsa
package scalac

import org.specs2._
import ScalacVersions._

class ScalacVersionSpec extends Specification {
  def is = s2"""
  ScalacVersion parser   ${testParser}
  ScalacVersion ordering ${testOrdering}
"""

  def testParser = (
    ScalacVersion("2.12.0-SNAPSHOT")  === Some(new ScalacVersion(2, 12, 0, None, Some("SNAPSHOT"))) and

    ScalacVersion("2.11.5")           === Some(`2.11.5`) and
    ScalacVersion("2.11.0-RC4")       === Some(new ScalacVersion(2, 11, 0, None, Some("RC4"))) and

    ScalacVersion("2.10.4")           === Some(`2.10.4`) and
    ScalacVersion("2.10.0-M7")        === Some(new ScalacVersion(2, 10, 0, None, Some("M7"))) and

    ScalacVersion("2.9.1-1")          === Some(`2.9.1-1`) and
    ScalacVersion("2.9.0-1-SNAPSHOT") === Some(new ScalacVersion(2, 9, 0, Some(1), Some("SNAPSHOT"))) and

    ScalacVersion("2.8.2")            === Some(`2.8.2`) and
    ScalacVersion("2.8.0-beta")       === Some(new ScalacVersion(2, 8, 0, None, Some("beta")))
  )

  def testOrdering = {
    val randomizedOrder = Seq(
      new ScalacVersion(2, 10, 0, None, Some("M7"))
    , new ScalacVersion(2, 12, 0, None, Some("SNAPSHOT"))
    , new ScalacVersion(2, 11, 0, None, Some("RC4"))
    , new ScalacVersion(2, 8, 0, None, Some("beta"))
    , new ScalacVersion(2, 9, 0, Some(1), Some("SNAPSHOT"))
    , new ScalacVersion(2, 11, 0, None, Some("M1"))
    , `2.10.0`
    , `2.11.4`
    , `2.11.5`
    , `2.10.4`
    , `2.9.0-1`
    , `2.9.0`
    , `2.9.1`
    , `2.9.1-1`
    , `2.8.0`
    , `2.8.2`
    )

    val expectedOrder = Seq(
      new ScalacVersion(2, 8, 0, None, Some("beta"))
    , `2.8.0`
    , `2.8.2`
    , `2.9.0`
    , new ScalacVersion(2, 9, 0, Some(1), Some("SNAPSHOT"))
    , `2.9.0-1`
    , `2.9.1`
    , `2.9.1-1`
    , new ScalacVersion(2, 10, 0, None, Some("M7"))
    , `2.10.0`
    , `2.10.4`
    , new ScalacVersion(2, 11, 0, None, Some("M1"))
    , new ScalacVersion(2, 11, 0, None, Some("RC4"))
    , `2.11.4`
    , `2.11.5`
    , new ScalacVersion(2, 12, 0, None, Some("SNAPSHOT"))
    )

    expectedOrder === randomizedOrder.sorted
  }
}
