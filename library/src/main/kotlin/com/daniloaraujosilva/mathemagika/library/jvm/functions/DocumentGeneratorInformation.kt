package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DocumentGeneratorInformation
 *
 * Full name:        System`DocumentGeneratorInformation
 *
 *                   DocumentGeneratorInformation[CloudObject] returns information about a generator.
 * Usage:            DocumentGeneratorInformation[CloudObject, property] returns the value of the specified property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DocumentGeneratorInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/DocumentGeneratorInformation.html
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
fun documentGeneratorInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DocumentGeneratorInformation", arguments.toMutableList(), options)
}
