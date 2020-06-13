package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SurdForm
 *
 * Full name:        System`SurdForm
 *
 * Usage:            SurdForm is an option to RadicalBox and SqrtBox that indicates whether the radical represents a Surd expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SurdForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurdForm.html
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
fun surdForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurdForm", arguments.toMutableList(), options)
}
