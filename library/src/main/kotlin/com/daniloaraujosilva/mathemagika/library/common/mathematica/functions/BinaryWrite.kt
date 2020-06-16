package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BinaryWrite
 *
 * Full name:        System`BinaryWrite
 *
 *                   BinaryWrite[channel, b] writes a byte of data, specified as an integer from 0 to 255.
 *                   BinaryWrite[channel, {b , b , …}] writes a sequence of bytes.
 *                                          1   2
 *                   BinaryWrite[channel, "string"] writes the raw sequence of characters in a string.
 *                   BinaryWrite[channel, ByteArray[…]] writes the contents of a ByteArray object.
 *                   BinaryWrite[channel, x, type] writes an object of the specified type.
 *                   BinaryWrite[channel, {x , x , …}, type] writes a sequence of objects of the specified type.
 *                                          1   2
 *                   BinaryWrite[channel, {x , x , …}, {type , type , …}] writes a sequence of objects with a sequence of types.
 * Usage:                                   1   2           1      2
 *
 * Options:          ByteOrdering :> $ByteOrdering
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BinaryWrite
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinaryWrite.html
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
fun binaryWrite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinaryWrite", arguments.toMutableList(), options)
}
