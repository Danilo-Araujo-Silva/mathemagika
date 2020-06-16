package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IsolatingInterval
 *
 * Full name:        System`IsolatingInterval
 *
 *                   IsolatingInterval[a] gives a rational isolating interval for the algebraic number a.
 * Usage:            IsolatingInterval[a, dx] gives an isolating interval of width at most dx.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IsolatingInterval
 * Documentation:    web: http://reference.wolfram.com/language/ref/IsolatingInterval.html
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
fun isolatingInterval(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IsolatingInterval", arguments.toMutableList(), options)
}
