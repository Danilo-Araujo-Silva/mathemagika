package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HarmonicMean
 *
 * Full name:        System`HarmonicMean
 *
 * Usage:            HarmonicMean[list] gives the harmonic mean of the values in list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HarmonicMean
 * Documentation:    web: http://reference.wolfram.com/language/ref/HarmonicMean.html
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
fun harmonicMean(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HarmonicMean", arguments.toMutableList(), options)
}
