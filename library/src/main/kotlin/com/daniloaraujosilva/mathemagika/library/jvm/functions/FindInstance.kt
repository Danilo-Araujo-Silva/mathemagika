package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindInstance
 *
 * Full name:        System`FindInstance
 *
 *                   FindInstance[expr, vars] finds an instance of vars that makes the statement expr be True.
 *                   FindInstance[expr, vars, dom] finds an instance over the domain dom. Common choices of dom are Complexes, Reals, Integers, and Booleans.
 * Usage:            FindInstance[expr, vars, dom, n] finds n instances.
 *
 *                   Method -> Automatic
 *                   Modulus -> 0
 *                   RandomSeeding -> 1234
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindInstance
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindInstance.html
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
fun findInstance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindInstance", arguments.toMutableList(), options)
}
