package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ReadList
 *
 * Full name:        System`ReadList
 *
 *                   ReadList["file"] reads all the remaining expressions in a file and returns a list of them.
 *                   ReadList["file", type] reads objects of the specified type from a file, until the end of the file is reached. The list of objects read is returned.
 *                   ReadList["file", {type , type , …}] reads objects with a sequence of types, until the end of the file is reached.
 *                                         1      2
 * Usage:            ReadList["file", types, n] reads only the first n objects of the specified types.
 *
 *                   NullRecords -> False
 *                   NullWords -> False
 *                   RecordLists -> False
 *                   RecordSeparators -> {
, ,
}
 *
 *                   TokenWords -> {}
 * Options:          WordSeparators -> { , 	}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReadList
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReadList.html
 *
 * Definitions:      ReadList[CloudObject`Private`failureObj:Failure["CloudObjectInvalidPathFailure" | "CloudObjectInvalidUUID", ___]] := CloudObject`Private`failureObj
 *
 * Own values:       None
 *
 * Down values:      ReadList[CloudObject`Private`failureObj:Failure["CloudObjectInvalidPathFailure" | "CloudObjectInvalidUUID", ___]] := CloudObject`Private`failureObj
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun readList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReadList", arguments.toMutableList(), options)
}
