package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpecificityGoal
 *
 * Full name:        System`SpecificityGoal
 *
 * Usage:            SpecificityGoal is an option for ImageIdentify and related functions that defines what specificity of object to seek to identify.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpecificityGoal
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpecificityGoal.html
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
fun specificityGoal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpecificityGoal", arguments.toMutableList(), options)
}
