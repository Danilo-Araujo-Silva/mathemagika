package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PartBehavior
 *
 * Full name:        System`PartBehavior
 *
 * Usage:            PartBehavior is an option to Query and related functions that specifies how nonexistent parts should be resolved.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PartBehavior
 * Documentation:    web: http://reference.wolfram.com/language/ref/PartBehavior.html
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
fun partBehavior(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PartBehavior", arguments.toMutableList(), options)
}
