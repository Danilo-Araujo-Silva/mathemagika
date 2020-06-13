package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CloudExpression
 *
 * Full name:        System`CloudExpression
 *
 *                   CloudExpression["name"] represents an expression whose value is persistently stored in the cloud.
 *                   CloudExpression["http://…"], CloudExpression["https://…"] represents a cloud expression with a given URI.
 *                   CloudExpression[base, part , part , …] represents the part of a cloud expression specified by the part .
 * Usage:                                      1      2                                                                    i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudExpression.html
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
fun cloudExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudExpression", arguments.toMutableList(), options)
}
