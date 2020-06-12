package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ControllerMethod
 *
 * Full name:        System`ControllerMethod
 *
 * Usage:            ControllerMethod is an option for Manipulate, Graphics3D, Plot3D, and related functions that specifies the default way that controls on an external controller device should apply.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllerMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllerMethod.html
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
fun controllerMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllerMethod", arguments.toMutableList(), options)
}
