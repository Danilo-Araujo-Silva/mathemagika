package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeGeneratorTasks
 *
 * Full name:        System`IncludeGeneratorTasks
 *
 * Usage:            IncludeGeneratorTasks is an option controlling the scope of scheduled task listings.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IncludeGeneratorTasks
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeGeneratorTasks.html
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
fun includeGeneratorTasks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeGeneratorTasks", arguments.toMutableList(), options)
}
