package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BiweightMidvariance
 *
 * Full name:        System`BiweightMidvariance
 *
 *                   BiweightMidvariance[list] gives the value of the biweight midvariance of the elements in list.
 * Usage:            BiweightMidvariance[list, c] gives the value of the biweight midvariance with scaling parameter c.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BiweightMidvariance
 * Documentation:    web: http://reference.wolfram.com/language/ref/BiweightMidvariance.html
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
fun biweightMidvariance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BiweightMidvariance", arguments.toMutableList(), options)
}
