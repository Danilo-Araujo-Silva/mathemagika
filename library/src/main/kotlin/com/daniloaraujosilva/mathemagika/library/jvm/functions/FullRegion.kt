package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FullRegion
 *
 * Full name:        System`FullRegion
 *
 *                                                             n
 * Usage:            FullRegion[n] represents the full region  .
 *
 * Options:          None
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FullRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/FullRegion.html
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
fun fullRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FullRegion", arguments.toMutableList(), options)
}
