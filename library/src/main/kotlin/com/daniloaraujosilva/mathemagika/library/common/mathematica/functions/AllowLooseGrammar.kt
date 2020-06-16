package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AllowLooseGrammar
 *
 * Full name:        System`AllowLooseGrammar
 *
 * Usage:            AllowLooseGrammar is an option for GrammarRules and related functions that specifies whether grammatical "fluff" should automatically be ignored in applying grammar rules.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AllowLooseGrammar
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowLooseGrammar.html
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
fun allowLooseGrammar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowLooseGrammar", arguments.toMutableList(), options)
}
