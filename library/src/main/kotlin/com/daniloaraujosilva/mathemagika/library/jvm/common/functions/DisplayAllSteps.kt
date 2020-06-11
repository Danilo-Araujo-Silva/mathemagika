package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DisplayAllSteps
 *
 * Full name:        System`DisplayAllSteps
 *
 * Usage:            DisplayAllSteps is an option to Animate and related functions that specifies whether all frames should be displayed in an animation, even if to do so would slow the animation down.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DisplayAllSteps
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisplayAllSteps.html
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
fun displayAllSteps(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisplayAllSteps", arguments.toMutableList(), options)
}
