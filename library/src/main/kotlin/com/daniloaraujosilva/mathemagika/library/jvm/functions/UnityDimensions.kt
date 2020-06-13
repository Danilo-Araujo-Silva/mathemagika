package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UnityDimensions
 *
 * Full name:        System`UnityDimensions
 *
 * Usage:            UnityDimensions is an option for UnitSimplify that specifies which UnitDimensions should be factored out.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnityDimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnityDimensions.html
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
fun unityDimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnityDimensions", arguments.toMutableList(), options)
}
