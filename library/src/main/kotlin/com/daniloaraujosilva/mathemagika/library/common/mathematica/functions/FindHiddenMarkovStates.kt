package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindHiddenMarkovStates
 *
 * Full name:        System`FindHiddenMarkovStates
 *
 *                   FindHiddenMarkovStates[data, hmm] finds the most likely hidden states of the HiddenMarkovProcess hmm corresponding to the emissions data.
 * Usage:            FindHiddenMarkovStates[data, hmm, crit] uses the given criterion crit to find the hidden states.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindHiddenMarkovStates
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindHiddenMarkovStates.html
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
fun findHiddenMarkovStates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindHiddenMarkovStates", arguments.toMutableList(), options)
}
