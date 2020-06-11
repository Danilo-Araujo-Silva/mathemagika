package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BinaryImageQ
 *
 * Full name:        System`BinaryImageQ
 *
 * Usage:            BinaryImageQ[image] yields True if image has the form of a binary Image or Image3D object, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BinaryImageQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinaryImageQ.html
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
fun binaryImageQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinaryImageQ", arguments.toMutableList(), options)
}
