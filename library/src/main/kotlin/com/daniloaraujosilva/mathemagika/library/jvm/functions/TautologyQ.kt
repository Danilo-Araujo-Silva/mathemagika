package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TautologyQ
 *
 * Full name:        System`TautologyQ
 *
 *                   TautologyQ[bf] gives True if all combinations of values of variables make the Boolean function bf yield True.
 *                   TautologyQ[expr, {a , a , …}] gives True if all combinations of values of the a  make the Boolean expression expr yield True.
 * Usage:                               1   2                                                       i
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TautologyQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/TautologyQ.html
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
fun tautologyQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TautologyQ", arguments.toMutableList(), options)
}
