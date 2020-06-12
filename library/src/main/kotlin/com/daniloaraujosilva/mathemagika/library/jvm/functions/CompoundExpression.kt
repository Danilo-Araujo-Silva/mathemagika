package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CompoundExpression
 *
 * Full name:        System`CompoundExpression
 *
 *                   expr  ; expr  ; … evaluates the expr  in turn, giving the last one as the result.
 * Usage:                1       2                       i
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompoundExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompoundExpression.html
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
fun compoundExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompoundExpression", arguments.toMutableList(), options)
}
