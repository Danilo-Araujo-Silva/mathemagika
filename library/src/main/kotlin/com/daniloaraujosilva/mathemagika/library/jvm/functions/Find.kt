package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Find
 *
 * Full name:        System`Find
 *
 *                   Find[stream, "text"] finds the first line in an input stream that contains the specified string.
 *                   Find[stream, {"text ", "text ", …}] finds the first line that contains any of the specified strings.
 * Usage:                               1        2
 *
 *                   AnchoredSearch -> False
 *                   IgnoreCase -> False
 *                   RecordSeparators -> {
, ,
}
 *
 *                   WordSearch -> False
 * Options:          WordSeparators -> { , 	}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Find
 * Documentation:    web: http://reference.wolfram.com/language/ref/Find.html
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
fun find(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Find", arguments.toMutableList(), options)
}
