package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CapForm
 *
 * Full name:        System`CapForm
 *
 * Usage:            CapForm[type] is a graphics primitive that specifies what type of caps should be used at the ends of lines, tubes, and related primitives.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CapForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/CapForm.html
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
fun capForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CapForm", arguments.toMutableList(), options)
}
