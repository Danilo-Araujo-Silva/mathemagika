package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PillaiTrace
 *
 * Full name:        System`PillaiTrace
 *
 *                   PillaiTrace[m , m ] gives Pillai's trace for the matrices m  and m .
 * Usage:                         1   2                                         1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PillaiTrace
 * Documentation:    web: http://reference.wolfram.com/language/ref/PillaiTrace.html
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
fun pillaiTrace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PillaiTrace", arguments.toMutableList(), options)
}
