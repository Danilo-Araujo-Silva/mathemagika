package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolyLog
 *
 * Full name:        System`PolyLog
 *
 *                   PolyLog[n, z] gives the polylogarithm function Li (z).
 *                                                                    n
 *                   PolyLog[n, p, z] gives the Nielsen generalized polylogarithm function S    (z).
 * Usage:                                                                                   n, p
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolyLog
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyLog.html
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
fun polyLog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyLog", arguments.toMutableList(), options)
}
