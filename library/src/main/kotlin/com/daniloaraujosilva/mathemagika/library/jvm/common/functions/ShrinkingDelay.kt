package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShrinkingDelay
 *
 * Full name:        System`ShrinkingDelay
 *
 * Usage:            ShrinkingDelay is an option for dynamic objects that specifies how long to delay before shrinking the size of the region in which the object is displayed to the actual size of the object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShrinkingDelay
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShrinkingDelay.html
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
fun shrinkingDelay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShrinkingDelay", arguments.toMutableList(), options)
}
