package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TouchscreenControlPlacement
 *
 * Full name:        System`TouchscreenControlPlacement
 *
 * Usage:            TouchscreenControlPlacement is an option for Manipulate that determines the placement of the slide-out control panel on supported touchscreen platforms.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TouchscreenControlPlacement
 * Documentation:    web: http://reference.wolfram.com/language/ref/TouchscreenControlPlacement.html
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
fun touchscreenControlPlacement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TouchscreenControlPlacement", arguments.toMutableList(), options)
}
