package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ValenceErrorHandling
 *
 * Full name:        System`ValenceErrorHandling
 *
 * Usage:            ValenceErrorHandling is an option for MoleculeModify that specifies whether molecule valences should be automatically adjusted after modification.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ValenceErrorHandling
 * Documentation:    web: http://reference.wolfram.com/language/ref/ValenceErrorHandling.html
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
fun valenceErrorHandling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ValenceErrorHandling", arguments.toMutableList(), options)
}
