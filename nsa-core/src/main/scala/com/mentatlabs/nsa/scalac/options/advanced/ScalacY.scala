package com.mentatlabs.nsa
package scalac
package options

/* -Y
 * ==
 *     2.6.0 - 2.6.1: Print a synopsis of private options
 *     2.7.0 - 2.7.7: !! missing !!
 *     2.8.0 - 2.8.2: Print a synopsis of private options
 *    2.9.0 - 2.12.0: Print a synopsis of private options.
 */
case object ScalacY
    extends ScalacOptionBoolean("-Y", ScalacVersions.`2.6.0`)
