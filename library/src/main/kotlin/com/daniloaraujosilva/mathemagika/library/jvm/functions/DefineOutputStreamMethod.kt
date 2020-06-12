package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DefineOutputStreamMethod
 *
 * Full name:        System`DefineOutputStreamMethod
 *
 *                   DefineOutputStreamMethod["name", {fname   function , fname   function , … }] defines a custom output stream method with the specified name, allowing the Wolfram Language to call the stream functions for opening and writing to an output stream.
 * Usage:                                                   1           1       2           2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefineOutputStreamMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefineOutputStreamMethod.html
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
fun defineOutputStreamMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefineOutputStreamMethod", arguments.toMutableList(), options)
}
