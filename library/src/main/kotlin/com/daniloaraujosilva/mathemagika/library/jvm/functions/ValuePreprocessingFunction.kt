package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ValuePreprocessingFunction
 *
 * Full name:        System`ValuePreprocessingFunction
 *
 * Usage:            ValuePreprocessingFunction is an option for functions such as PersistentValue and InitializationValue that specifies a function to apply to a new value that is being assigned.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ValuePreprocessingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ValuePreprocessingFunction.html
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
fun valuePreprocessingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ValuePreprocessingFunction", arguments.toMutableList(), options)
}
