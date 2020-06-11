package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IndeterminateThreshold
 *
 * Full name:        System`IndeterminateThreshold
 *
 * Usage:            IndeterminateThreshold is an option for Classify, Predict, and related functions that specifies below what probability or probability density a result should be considered indeterminate.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IndeterminateThreshold
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndeterminateThreshold.html
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
fun indeterminateThreshold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndeterminateThreshold", arguments.toMutableList(), options)
}
