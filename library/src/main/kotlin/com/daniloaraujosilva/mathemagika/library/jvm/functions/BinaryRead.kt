package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BinaryRead
 *
 * Full name:        System`BinaryRead
 *
 *                   BinaryRead[stream] reads one byte of raw binary data from an input stream, and returns an integer from 0 to 255.
 *                   BinaryRead[stream, type] reads an object of the specified type.
 *                   BinaryRead[stream, {type , type , …}] reads a sequence of objects of the specified types.
 * Usage:                                    1      2
 *
 *                   AllowIncomplete -> False
 *                   ByteOrdering :> $ByteOrdering
 * Options:          Path :> $Path
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BinaryRead
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinaryRead.html
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
fun binaryRead(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinaryRead", arguments.toMutableList(), options)
}
