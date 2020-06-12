package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BinaryReadList
 *
 * Full name:        System`BinaryReadList
 *
 *                   BinaryReadList["file"] reads all remaining bytes from a file, and returns them as a list of integers from 0 to 255.
 *                   BinaryReadList["file", type] reads objects of the specified type from a file, until the end of the file is reached. The list of objects read is returned.
 *                   BinaryReadList["file", {type , type , …}] reads objects with a sequence of types, until the end of the file is reached.
 *                                               1      2
 * Usage:            BinaryReadList["file", types, n] reads only the first n objects of the specified types.
 *
 *                   AllowIncomplete -> False
 *                   ByteOrdering :> $ByteOrdering
 * Options:          Path :> $Path
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BinaryReadList
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinaryReadList.html
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
fun binaryReadList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinaryReadList", arguments.toMutableList(), options)
}
