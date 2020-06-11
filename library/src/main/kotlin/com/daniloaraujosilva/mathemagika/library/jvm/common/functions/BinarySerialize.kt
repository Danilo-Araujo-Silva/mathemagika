package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BinarySerialize
 *
 * Full name:        System`BinarySerialize
 *
 * Usage:            BinarySerialize[expr] gives a binary representation of any expression expr as a ByteArray object.
 *
 *                   Method -> Automatic
 * Options:          PerformanceGoal -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BinarySerialize
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinarySerialize.html
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
fun binarySerialize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinarySerialize", arguments.toMutableList(), options)
}
