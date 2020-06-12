package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dt
 *
 * Full name:        System`Dt
 *
 *                   Dt[f, x] gives the total derivative df/dx.
 *                   Dt[f] gives the total differential df.
 *                                                                n      n
 *                   Dt[f, {x, n}] gives the multiple derivative d  f/d x .
 *                   Dt[f, x , x , …] gives d/d x  d/d x  … f.
 * Usage:                   1   2                1      2
 *
 * Options:          Constants -> {}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Dt
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dt.html
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
fun dt(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dt", arguments.toMutableList(), options)
}
