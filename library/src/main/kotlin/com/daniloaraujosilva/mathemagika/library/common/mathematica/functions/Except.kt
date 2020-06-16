package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Except
 *
 * Full name:        System`Except
 *
 *                   Except[c] is a pattern object which represents any expression except one that matches c.
 * Usage:            Except[c, p] represents any expression that matches p but not c.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Except
 * Documentation:    web: http://reference.wolfram.com/language/ref/Except.html
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
fun except(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Except", arguments.toMutableList(), options)
}
