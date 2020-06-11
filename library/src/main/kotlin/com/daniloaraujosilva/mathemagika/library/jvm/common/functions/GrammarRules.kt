package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GrammarRules
 *
 * Full name:        System`GrammarRules
 *
 *                   GrammarRules[rules] represents grammar rules to be deployed to a cloud object that implements the grammar in a form suitable for use with functions like GrammarApply and Interpreter.
 * Usage:            GrammarRules[rules, defs] uses grammar definitions defs.
 *
 *                   AllowLooseGrammar -> True
 *                   AmbiguityFunction -> Automatic
 *                   IgnoreCase -> True
 *                   IgnoreDiacritics -> True
 *                   Initialization -> None
 * Options:          SaveDefinitions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GrammarRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/GrammarRules.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun grammarRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GrammarRules", arguments.toMutableList(), options)
}
