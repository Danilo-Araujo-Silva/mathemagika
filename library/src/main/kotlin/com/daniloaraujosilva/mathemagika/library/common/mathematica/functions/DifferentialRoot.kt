package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DifferentialRoot
 *
 * Full name:        System`DifferentialRoot
 *
 *                   DifferentialRoot[lde][x] gives the holonomic function h(x), specified by the linear differential equation lde[h, x].
 * Usage:            DifferentialRoot[lde] represents a pure holonomic function h.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DifferentialRoot
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferentialRoot.html
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
fun differentialRoot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferentialRoot", arguments.toMutableList(), options)
}
