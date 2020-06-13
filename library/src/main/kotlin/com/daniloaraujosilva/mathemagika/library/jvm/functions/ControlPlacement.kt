package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ControlPlacement
 *
 * Full name:        System`ControlPlacement
 *
 * Usage:            ControlPlacement is an option for Manipulate, TabView, and other control objects that specifies where controls should be placed.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControlPlacement
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControlPlacement.html
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
fun controlPlacement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControlPlacement", arguments.toMutableList(), options)
}
