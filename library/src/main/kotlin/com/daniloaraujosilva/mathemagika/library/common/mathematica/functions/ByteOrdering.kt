package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ByteOrdering
 *
 * Full name:        System`ByteOrdering
 *
 * Usage:            ByteOrdering is an option for BinaryRead, BinaryWrite, and related functions that specifies what ordering of bytes should be assumed for your computer system.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ByteOrdering
 * Documentation:    web: http://reference.wolfram.com/language/ref/ByteOrdering.html
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
fun byteOrdering(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ByteOrdering", arguments.toMutableList(), options)
}
