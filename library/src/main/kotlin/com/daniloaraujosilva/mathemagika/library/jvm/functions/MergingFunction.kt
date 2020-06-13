package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MergingFunction
 *
 * Full name:        System`MergingFunction
 *
 * Usage:            MergingFunction is an option for functions such as PersistentValue that specifies a function to apply to the list of values found.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MergingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MergingFunction.html
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
fun mergingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MergingFunction", arguments.toMutableList(), options)
}
