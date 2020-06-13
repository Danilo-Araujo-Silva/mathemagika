package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CalloutMarker
 *
 * Full name:        System`CalloutMarker
 *
 * Usage:            CalloutMarker is an option for Callout that specifies what marker to draw at the end of the leader in a callout.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CalloutMarker
 * Documentation:    web: http://reference.wolfram.com/language/ref/CalloutMarker.html
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
fun calloutMarker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CalloutMarker", arguments.toMutableList(), options)
}
