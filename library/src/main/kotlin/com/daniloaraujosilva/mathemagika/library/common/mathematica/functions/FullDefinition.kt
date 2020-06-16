package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FullDefinition
 *
 * Full name:        System`FullDefinition
 *
 * Usage:            FullDefinition[symbol] prints as the definitions given for symbol, and all symbols on which these depend.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FullDefinition
 * Documentation:    web: http://reference.wolfram.com/language/ref/FullDefinition.html
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
fun fullDefinition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FullDefinition", arguments.toMutableList(), options)
}
