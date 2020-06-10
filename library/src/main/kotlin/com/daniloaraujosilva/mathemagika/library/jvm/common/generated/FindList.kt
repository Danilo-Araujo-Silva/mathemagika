package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindList
 * 
 * Full name:        System`FindList
 * 
 *                   FindList["file", "text"] gives a list of lines in the file that contain the specified string. 
 *                   FindList["file", {"text ", "text ", …}] gives a list of all lines that contain any of the specified strings. 
 *                                          1        2
 *                   FindList[{"file ", …}, …] gives a list of lines containing the specified strings in any of the file . 
 *                                  1                                                                                   i
 * Usage:            FindList[files, text, n] includes only the first n lines found. 
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
 *                   local: paclet:ref/FindList
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindList.html
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
fun findList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindList", arguments.toMutableList(), options)
}
