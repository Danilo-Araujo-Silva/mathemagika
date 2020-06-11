package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Shallow
 *
 * Full name:        System`Shallow
 *
 *                   Shallow[expr] prints as a shallow form of expr.
 *                   Shallow[expr, depth] prints with all parts of expr below the specified depth given in skeleton form.
 *                   Shallow[expr, {depth, length}] also gives parts whose lengths are above the specified limit in skeleton form.
 * Usage:            Shallow[expr, {depth, length}, form] uses skeleton form for any parts that match the pattern form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Shallow
 * Documentation:    web: http://reference.wolfram.com/language/ref/Shallow.html
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
fun shallow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Shallow", arguments.toMutableList(), options)
}
