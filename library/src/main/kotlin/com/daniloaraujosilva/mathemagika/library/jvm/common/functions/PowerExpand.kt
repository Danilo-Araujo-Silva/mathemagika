package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PowerExpand
 *
 * Full name:        System`PowerExpand
 *
 *                   PowerExpand[expr] expands all powers of products and powers.
 *                   PowerExpand[expr, {x , x , …}] expands only with respect to the variables x .
 * Usage:                                1   2                                                  i
 *
 * Options:          Assumptions -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PowerExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/PowerExpand.html
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
fun powerExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PowerExpand", arguments.toMutableList(), options)
}
