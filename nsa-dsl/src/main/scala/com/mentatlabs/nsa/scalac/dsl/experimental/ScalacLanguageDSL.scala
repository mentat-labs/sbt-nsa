package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacLanguageDSL
    extends ScalacExperimentalDSL {

  object language {
    val unary_- = options.ScalacLanguage

    def apply(feature: String) = new {
      def unary_- = options.ScalacLanguage(feature)
    }

    def apply(features: LanguageFeature*) = new {
      def unary_- = new ScalacOptionChoice(options.ScalacLanguage.setting, features.map(_.toString): _*) {
        def since = options.ScalacLanguage.since
      }
    }
  }

  sealed trait LanguageFeature

  case object dynamics extends LanguageFeature {
    val unary_- = `-dynamics`
  }
  case object `-dynamics` extends LanguageFeature

  case object postfixOps extends LanguageFeature {
    val unary_- = `-postfixOps`
  }
  case object `-postfixOps` extends LanguageFeature

  case object reflectiveCalls extends LanguageFeature {
    val unary_- = `-reflectiveCalls`
  }
  case object `-reflectiveCalls` extends LanguageFeature

  case object implicitConversions extends LanguageFeature {
    val unary_- = `-implicitConversions`
  }
  case object `-implicitConversions` extends LanguageFeature

  case object existentials extends LanguageFeature {
    val unary_- = `-existentials`
  }
  case object `-existentials` extends LanguageFeature

  case object `experimental.macros` extends LanguageFeature {
    val unary_- = `-experimental.macros`
  }
  object experimental {
    val macros = `experimental.macros`
  }
  case object `-experimental.macros` extends LanguageFeature
}
