package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LanguageIdentify
 *
 * Full name:        System`LanguageIdentify
 *
 * Usage:            LanguageIdentify["string"] attempts to determine what human language text in string is in, predominantly.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LanguageIdentify
 * Documentation:    web: http://reference.wolfram.com/language/ref/LanguageIdentify.html
 *
 *                   Internal`Private`LHS:LanguageIdentify[NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text_] := Internal`ConditionalValueBody[Internal`Private`LHS, {StringQ[NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text] || VectorQ[NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text, StringQ]}, {{"string", 1, Internal`ConditionalValueLHS}}, Classify["Language"][NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text]]
 * Definitions:      Developer`Private`LHS$_LanguageIdentify := RuleCondition[Developer`CheckArgumentCount[Developer`Private`LHS$, 1, 1]; Fail]
 *
 * Own values:       None
 *
 *                   Internal`Private`LHS:LanguageIdentify[NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text_] := Internal`ConditionalValueBody[Internal`Private`LHS, {StringQ[NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text] || VectorQ[NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text, StringQ]}, {{"string", 1, Internal`ConditionalValueLHS}}, Classify["Language"][NaturalLanguageProcessing`LanguageIdentify`PackagePrivate`text]]
 * Down values:      Developer`Private`LHS$_LanguageIdentify := RuleCondition[Developer`CheckArgumentCount[Developer`Private`LHS$, 1, 1]; Fail]
 *
 * Up values:        Internal`ArgumentCountRegistry[LanguageIdentify] ^= {1, 1}
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun languageIdentify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LanguageIdentify", arguments.toMutableList(), options)
}
