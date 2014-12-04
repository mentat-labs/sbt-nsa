package hr.element.nsa
package dsl

object forwarders

object patmat
object analysis

object uescape

object Xno {
  val unary_- = `-Xno`
  object `-Xno` {
    def -(f: forwarders.type) = `-Xno-forwarders`

    def -(p: patmat.type) = `-Xno-patmat`
    object `-Xno-patmat` {
      def -(a: analysis.type) = `-Xno-patmat-analysis`
    }

    def -(u: uescape.type) = `-Xno-uescape`
  }
}
