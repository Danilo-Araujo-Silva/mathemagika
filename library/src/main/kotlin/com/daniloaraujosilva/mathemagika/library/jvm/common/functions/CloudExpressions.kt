package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudExpressions
 *
 * Full name:        System`CloudExpressions
 *
 *                   CloudExpressions[] gives a list of named cloud expressions owned by you.
 *                   CloudExpressions[None] gives a list of anonymous cloud expressions owned by you.
 * Usage:            CloudExpressions[All] gives a list of all cloud expressions owned by you.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudExpressions
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudExpressions.html
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
fun cloudExpressions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudExpressions", arguments.toMutableList(), options)
}
