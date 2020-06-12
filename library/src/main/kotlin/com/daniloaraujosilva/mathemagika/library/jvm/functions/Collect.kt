package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Collect
 *
 * Full name:        System`Collect
 *
 *                   Collect[expr, x] collects together terms involving the same powers of objects matching x.
 *                   Collect[expr, {x , x , …}] collects together terms that involve the same powers of objects matching x , x , ….
 *                                   1   2                                                                                1   2
 * Usage:            Collect[expr, var, h] applies h to the expression that forms the coefficient of each term obtained.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Collect
 * Documentation:    web: http://reference.wolfram.com/language/ref/Collect.html
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
fun collect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Collect", arguments.toMutableList(), options)
}
