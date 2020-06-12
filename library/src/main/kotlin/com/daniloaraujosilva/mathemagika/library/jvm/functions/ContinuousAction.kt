package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContinuousAction
 *
 * Full name:        System`ContinuousAction
 *
 * Usage:            ContinuousAction is an option for Manipulate, Slider, and related functions that specifies whether action should be taken continuously while controls are being moved.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContinuousAction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuousAction.html
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
fun continuousAction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuousAction", arguments.toMutableList(), options)
}
