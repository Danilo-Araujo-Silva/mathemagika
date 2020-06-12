package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Scan
 *
 * Full name:        System`Scan
 *
 *                   Scan[f, expr] evaluates f applied to each element of expr in turn.
 *                   Scan[f, expr, levelspec] applies f to parts of expr specified by levelspec.
 * Usage:            Scan[f] represents an operator form of Scan that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Scan
 * Documentation:    web: http://reference.wolfram.com/language/ref/Scan.html
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
fun scan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Scan", arguments.toMutableList(), options)
}
