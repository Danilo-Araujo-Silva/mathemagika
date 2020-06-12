package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ControllerPath
 *
 * Full name:        System`ControllerPath
 *
 * Usage:            ControllerPath is an option that gives a list of external controllers or classes of controllers to try for functions such as ControllerState, Manipulate, and Graphics3D.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllerPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllerPath.html
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
fun controllerPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllerPath", arguments.toMutableList(), options)
}
