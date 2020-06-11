package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FormBox
 *
 * Full name:        System`FormBox
 *
 * Usage:            FormBox[boxes, form] is a low-level box construct which displays as boxes but specifies that rules associated with form should be used to interpret boxes on input.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FormBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormBox.html
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
fun formBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormBox", arguments.toMutableList(), options)
}
