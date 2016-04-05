package com.mentatlabs.nsa
package scalac
package options

import java.nio.charset.Charset

/* -encoding <encoding>
 * ====================
 *     2.0.0 - 2.8.2: Specify character encoding used by source files
 *    2.9.0 - 2.12.0: Specify character encoding used by source files.
 */
object ScalacEncoding
    extends ScalacOptionValueContainer[String]("-encoding", ScalacVersions.`2.0.0`)
    with shared.EncodingOptions {

  def apply(encoding: Charset) =
    custom(encoding)
}
