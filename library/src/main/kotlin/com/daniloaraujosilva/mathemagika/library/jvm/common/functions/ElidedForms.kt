package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ElidedForms
 *
 * Full name:        System`ElidedForms
 *
 * Usage:            ElidedForms is an option to TextString and related functions that specifies which expressions should be elided.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ElidedForms
 * Documentation:    web: http://reference.wolfram.com/language/ref/ElidedForms.html
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
fun elidedForms(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ElidedForms", arguments.toMutableList(), options)
}
