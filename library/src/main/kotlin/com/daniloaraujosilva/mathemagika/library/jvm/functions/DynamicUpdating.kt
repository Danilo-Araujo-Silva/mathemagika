package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DynamicUpdating
 *
 * Full name:        System`DynamicUpdating
 *
 * Usage:            DynamicUpdating is an option for displayed objects, cells and notebooks that specifies whether dynamic objects and option values in their contents will update.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DynamicUpdating
 * Documentation:    web: http://reference.wolfram.com/language/ref/DynamicUpdating.html
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
fun dynamicUpdating(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicUpdating", arguments.toMutableList(), options)
}
