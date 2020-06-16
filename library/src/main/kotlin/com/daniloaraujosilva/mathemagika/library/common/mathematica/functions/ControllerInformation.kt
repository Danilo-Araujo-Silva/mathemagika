package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ControllerInformation
 *
 * Full name:        System`ControllerInformation
 *
 * Usage:            ControllerInformation[] gives dynamically updated information on currently connected controller devices.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllerInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllerInformation.html
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
fun controllerInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllerInformation", arguments.toMutableList(), options)
}
