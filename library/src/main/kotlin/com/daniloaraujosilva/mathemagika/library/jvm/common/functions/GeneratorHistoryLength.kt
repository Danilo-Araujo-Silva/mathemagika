package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeneratorHistoryLength
 *
 * Full name:        System`GeneratorHistoryLength
 *
 * Usage:            GeneratorHistoryLength is an option for document generators controlling the number of runs archived in the cloud.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GeneratorHistoryLength
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeneratorHistoryLength.html
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
fun generatorHistoryLength(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeneratorHistoryLength", arguments.toMutableList(), options)
}
