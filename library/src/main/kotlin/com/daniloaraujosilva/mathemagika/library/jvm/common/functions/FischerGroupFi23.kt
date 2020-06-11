package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FischerGroupFi23
 *
 * Full name:        System`FischerGroupFi23
 *
 *                   FischerGroupFi23[] represents the sporadic simple Fischer group Fi  .
 * Usage:                                                                              23
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FischerGroupFi23
 * Documentation:    web: http://reference.wolfram.com/language/ref/FischerGroupFi23.html
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
fun fischerGroupFi23(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FischerGroupFi23", arguments.toMutableList(), options)
}
