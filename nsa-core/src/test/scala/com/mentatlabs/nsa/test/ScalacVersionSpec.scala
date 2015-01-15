package com.mentatlabs.nsa
package test

import org.specs2._

class ScalacVersionSpec extends Specification {
  def is = s2"""
  ScalacVersion parser   ${testParser}
  ScalacVersion ordering ${testOrdering}
"""

  def testParser = (
    ScalacVersion("2.12.0-SNAPSHOT")  === Some(new ScalacVersion(2, 12, 0, None, Some("SNAPSHOT"))) and

    ScalacVersion("2.11.5")           === Some(ScalacVersion.`2.11.5`) and
    ScalacVersion("2.11.0-RC4")       === Some(new ScalacVersion(2, 11, 0, None, Some("RC4"))) and

    ScalacVersion("2.10.4")           === Some(ScalacVersion.`2.10.4`) and
    ScalacVersion("2.10.0-M7")        === Some(new ScalacVersion(2, 10, 0, None, Some("M7"))) and

    ScalacVersion("2.9.1-1")          === Some(ScalacVersion.`2.9.1-1`) and
    ScalacVersion("2.9.0-1-SNAPSHOT") === Some(new ScalacVersion(2, 9, 0, Some(1), Some("SNAPSHOT"))) and

    ScalacVersion("2.8.2")            === Some(ScalacVersion.`2.8.2`) and
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
    , ScalacVersion.`2.10.0`
    , ScalacVersion.`2.11.4`
    , ScalacVersion.`2.11.5`
    , ScalacVersion.`2.10.4`
    , ScalacVersion.`2.9.0-1`
    , ScalacVersion.`2.9.0`
    , ScalacVersion.`2.9.1`
    , ScalacVersion.`2.9.1-1`
    , ScalacVersion.`2.8.0`
    , ScalacVersion.`2.8.2`
    )

    val expectedOrder = Seq(
      new ScalacVersion(2, 8, 0, None, Some("beta"))
    , ScalacVersion.`2.8.0`
    , ScalacVersion.`2.8.2`
    , ScalacVersion.`2.9.0`
    , new ScalacVersion(2, 9, 0, Some(1), Some("SNAPSHOT"))
    , ScalacVersion.`2.9.0-1`
    , ScalacVersion.`2.9.1`
    , ScalacVersion.`2.9.1-1`
    , new ScalacVersion(2, 10, 0, None, Some("M7"))
    , ScalacVersion.`2.10.0`
    , ScalacVersion.`2.10.4`
    , new ScalacVersion(2, 11, 0, None, Some("M1"))
    , new ScalacVersion(2, 11, 0, None, Some("RC4"))
    , ScalacVersion.`2.11.4`
    , ScalacVersion.`2.11.5`
    , new ScalacVersion(2, 12, 0, None, Some("SNAPSHOT"))
    )

    expectedOrder === randomizedOrder.sorted
  }
}
