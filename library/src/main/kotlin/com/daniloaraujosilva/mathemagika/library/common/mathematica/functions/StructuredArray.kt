package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StructuredArray
 *
 * Full name:        System`StructuredArray
 *
 *                   StructuredArray[st, {d , d , …}, data] represents a d ×d ×… array with structure type st and specific content data.
 * Usage:                                  1   2                          1  2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StructuredArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/StructuredArray.html
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
fun structuredArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StructuredArray", arguments.toMutableList(), options)
}
