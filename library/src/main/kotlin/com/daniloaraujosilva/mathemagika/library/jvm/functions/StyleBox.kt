package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StyleBox
 *
 * Full name:        System`StyleBox
 *
 *                   StyleBox[boxes, options] is a low-level representation of boxes to be shown with the specified option settings.
 * Usage:            StyleBox[boxes, "style"] uses the option setting for the specified style in the current notebook.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StyleBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/StyleBox.html
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
fun styleBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StyleBox", arguments.toMutableList(), options)
}
