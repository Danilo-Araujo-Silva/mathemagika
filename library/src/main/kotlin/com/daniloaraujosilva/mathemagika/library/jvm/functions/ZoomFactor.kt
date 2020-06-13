package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ZoomFactor
 *
 * Full name:        System`ZoomFactor
 *
 * Usage:            ZoomFactor is an option for DynamicImage that specifies the magnification factor of a zoom.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ZoomFactor
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZoomFactor.html
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
fun zoomFactor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZoomFactor", arguments.toMutableList(), options)
}
