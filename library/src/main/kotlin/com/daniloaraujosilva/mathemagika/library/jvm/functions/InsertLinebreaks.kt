package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InsertLinebreaks
 *
 * Full name:        System`InsertLinebreaks
 *
 *                   InsertLinebreaks["string"] inserts newline characters into string to make a string in which no line is longer than 78 characters.
 * Usage:            InsertLinebreaks["string", n] inserts newline characters to make no line longer than n characters.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InsertLinebreaks
 * Documentation:    web: http://reference.wolfram.com/language/ref/InsertLinebreaks.html
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
fun insertLinebreaks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InsertLinebreaks", arguments.toMutableList(), options)
}
