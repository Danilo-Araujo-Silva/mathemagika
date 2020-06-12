package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContraharmonicMean
 *
 * Full name:        System`ContraharmonicMean
 *
 *                   ContraharmonicMean[list] gives the contraharmonic mean of the values in list.
 * Usage:            ContraharmonicMean[list, p] gives the order p Lehmer contraharmonic mean.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContraharmonicMean
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContraharmonicMean.html
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
fun contraharmonicMean(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContraharmonicMean", arguments.toMutableList(), options)
}
