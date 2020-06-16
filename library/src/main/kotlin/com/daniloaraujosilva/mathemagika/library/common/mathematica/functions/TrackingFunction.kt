package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TrackingFunction
 *
 * Full name:        System`TrackingFunction
 *
 * Usage:            TrackingFunction is an option for Manipulate controls that specifies functions to use during interactive changing or editing.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrackingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrackingFunction.html
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
fun trackingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrackingFunction", arguments.toMutableList(), options)
}
