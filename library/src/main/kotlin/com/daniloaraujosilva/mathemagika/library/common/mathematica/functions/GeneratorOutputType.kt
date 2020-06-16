package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeneratorOutputType
 *
 * Full name:        System`GeneratorOutputType
 *
 * Usage:            GeneratorOutputType is an option controlling the file format of documents produced by a DocumentGenerator.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GeneratorOutputType
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeneratorOutputType.html
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
fun generatorOutputType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeneratorOutputType", arguments.toMutableList(), options)
}
