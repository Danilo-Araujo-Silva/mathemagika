package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeForm
 *
 * Full name:        System`EdgeForm
 *
 * Usage:            EdgeForm[g] is a graphics directive that specifies that edges of polygons and other filled graphics objects are to be drawn using the graphics directive or list of directives g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EdgeForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeForm.html
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
fun edgeForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeForm", arguments.toMutableList(), options)
}
