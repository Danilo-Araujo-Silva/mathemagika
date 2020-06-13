package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TotalLayer
 *
 * Full name:        System`TotalLayer
 *
 * Usage:            TotalLayer[] represents a net layer taking a list of input arrays and performing elementwise addition on them.
 *
 *                   Inputs -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TotalLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/TotalLayer.html
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
fun totalLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TotalLayer", arguments.toMutableList(), options)
}
