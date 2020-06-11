package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FrenetSerretSystem
 *
 * Full name:        System`FrenetSerretSystem
 *
 *                   FrenetSerretSystem[{x , …, x }, t] gives the generalized curvatures and Frenet–Serret basis for the parametric curve x [t].
 *                                        1      n                                                                                         i
 *                   FrenetSerretSystem[{x , …, x }, t, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                                 1      n                             i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FrenetSerretSystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrenetSerretSystem.html
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
fun frenetSerretSystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrenetSerretSystem", arguments.toMutableList(), options)
}
