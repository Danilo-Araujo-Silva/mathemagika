package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Assuming
 *
 * Full name:        System`Assuming
 *
 * Usage:            Assuming[assum, expr] evaluates expr with assum appended to $Assumptions, so that assum is included in the default assumptions used by functions such as Refine, Simplify, and Integrate.
 *
 * Options:          None
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Assuming
 * Documentation:    web: http://reference.wolfram.com/language/ref/Assuming.html
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
fun assuming(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Assuming", arguments.toMutableList(), options)
}
