package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DifferenceRoot
 *
 * Full name:        System`DifferenceRoot
 *
 *                   DifferenceRoot[lde][k] gives the holonomic sequence h(k), specified by the linear difference equation lde[h, k].
 * Usage:            DifferenceRoot[lde] represents a pure holonomic sequence h.
 *
 * Options:          None
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DifferenceRoot
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferenceRoot.html
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
fun differenceRoot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferenceRoot", arguments.toMutableList(), options)
}
