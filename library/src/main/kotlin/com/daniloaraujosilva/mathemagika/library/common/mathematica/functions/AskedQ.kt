package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AskedQ
 *
 * Full name:        System`AskedQ
 *
 * Usage:            AskedQ["key"] is a construct for use inside AskFunction that gives True if a value is currently associated with key, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AskedQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AskedQ.html
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
fun askedQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AskedQ", arguments.toMutableList(), options)
}
