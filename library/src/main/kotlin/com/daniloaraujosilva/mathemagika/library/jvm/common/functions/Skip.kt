package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Skip
 *
 * Full name:        System`Skip
 *
 *                   Skip[stream, type] skips one object of the specified type in an input stream.
 * Usage:            Skip[stream, type, n] skips n objects of the specified type.
 *
 *                   NullRecords -> False
 *                   NullWords -> False
 *                   RecordSeparators -> {
, ,
}
 *
 *                   TokenWords -> {}
 * Options:          WordSeparators -> { , 	}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Skip
 * Documentation:    web: http://reference.wolfram.com/language/ref/Skip.html
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
fun skip(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Skip", arguments.toMutableList(), options)
}
