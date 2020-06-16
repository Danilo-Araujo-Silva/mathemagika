package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceReplace
 *
 * Full name:        System`SequenceReplace
 *
 *                   SequenceReplace[list, rules] replaces sequences in list according to the specified rule or list of rules.
 *                   SequenceReplace[list, rules, n] does only the first n replacements.
 * Usage:            SequenceReplace[rules] represents an operator form of SequenceReplace that can be applied to an expression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceReplace.html
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
fun sequenceReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceReplace", arguments.toMutableList(), options)
}
