package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AskedValue
 *
 * Full name:        System`AskedValue
 *
 * Usage:            AskedValue["key"] is a construct for use inside AskFunction that gives the value associated with key, or Missing[…] if none has been provided.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AskedValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AskedValue.html
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
fun askedValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AskedValue", arguments.toMutableList(), options)
}
