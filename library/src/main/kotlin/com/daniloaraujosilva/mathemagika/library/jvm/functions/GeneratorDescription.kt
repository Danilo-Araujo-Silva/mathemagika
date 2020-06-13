package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeneratorDescription
 *
 * Full name:        System`GeneratorDescription
 *
 * Usage:            GeneratorDescription is an option for providing a textual description for a DocumentGenerator.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GeneratorDescription
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeneratorDescription.html
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
fun generatorDescription(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeneratorDescription", arguments.toMutableList(), options)
}
