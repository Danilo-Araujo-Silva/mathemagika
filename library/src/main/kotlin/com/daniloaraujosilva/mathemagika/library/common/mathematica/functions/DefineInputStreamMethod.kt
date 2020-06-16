package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefineInputStreamMethod
 *
 * Full name:        System`DefineInputStreamMethod
 *
 *                   DefineInputStreamMethod["name", {fname   function , fname   function , … }] defines a custom input stream method with the specified name, allowing the Wolfram Language to call the stream functions fname  for opening and reading from an input stream.
 * Usage:                                                  1           1       2           2                                                                                                                                     i
 *
 * Options:          Seekable -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefineInputStreamMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefineInputStreamMethod.html
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
fun defineInputStreamMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefineInputStreamMethod", arguments.toMutableList(), options)
}
