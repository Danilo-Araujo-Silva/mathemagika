package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AlgebraicNumberTrace
 *
 * Full name:        System`AlgebraicNumberTrace
 *
 * Usage:            AlgebraicNumberTrace[a] gives the trace of the algebraic number a.
 *
 * Options:          Extension -> None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AlgebraicNumberTrace
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlgebraicNumberTrace.html
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
fun algebraicNumberTrace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlgebraicNumberTrace", arguments.toMutableList(), options)
}
