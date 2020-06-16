package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Inpaint
 *
 * Full name:        System`Inpaint
 *
 * Usage:            Inpaint[image, region] retouches parts of image that correspond to nonzero elements in region.
 *
 *                   MaxIterations -> 100
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Inpaint
 * Documentation:    web: http://reference.wolfram.com/language/ref/Inpaint.html
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
fun inpaint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Inpaint", arguments.toMutableList(), options)
}
