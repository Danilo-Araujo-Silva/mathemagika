package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NeumannValue
 *
 * Full name:        System`NeumannValue
 *
 * Usage:            NeumannValue[val, pred] represents a Neumann boundary value val, specified on the part of the boundary of the region given to NDSolve and related functions where pred is True.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NeumannValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/NeumannValue.html
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
fun neumannValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NeumannValue", arguments.toMutableList(), options)
}
