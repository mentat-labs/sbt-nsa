package com.mentatlabs.nsa
package scalac
package options

/* -Yrepl-class-based
 * ==================
 *   2.11.0 - 2.12.0: Use classes to wrap REPL snippets instead of objects
 */
case object ScalacYReplClassBased
    extends ScalacOptionBoolean("-Yrepl-class-based", ScalacVersions.`2.11.0`)
