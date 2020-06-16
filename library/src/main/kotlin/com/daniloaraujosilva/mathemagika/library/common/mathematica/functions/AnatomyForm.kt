package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AnatomyForm
 *
 * Full name:        System`AnatomyForm
 *
 * Usage:            AnatomyForm[g] is a graphics directive used in AnatomyPlot3D that specifies how anatomy entity‐based graphics objects are to be drawn using the graphics directive or association of directives g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnatomyForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnatomyForm.html
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
fun anatomyForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnatomyForm", arguments.toMutableList(), options)
}
