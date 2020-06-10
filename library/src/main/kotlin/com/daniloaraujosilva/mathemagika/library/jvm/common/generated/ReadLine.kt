package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ReadLine
 * 
 * Full name:        System`ReadLine
 * 
 *                   ReadLine[stream] reads a line of text from a stream and returns it as a string.
 * Usage:            ReadLine[proc] reads a line of text generated by an external process and returns it as a string.
 * 
 * Options:          TimeConstraint -> Infinity
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ReadLine
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReadLine.html
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
fun readLine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReadLine", arguments.toMutableList(), options)
}