package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ControllerState
 *
 * Full name:        System`ControllerState
 *
 *                   ControllerState["c"] gives the state of the control c for the first connected controller device on which it is supported.
 *                   ControllerState[{"c ", "c ", …}] gives the states of several controls.
 *                                      1     2
 *                   ControllerState[id, "c"] gives the state of control c for controller devices with the specified identifier.
 *                   ControllerState[id, {"c ", "c ", …}] gives the states of several controls for several controller devices.
 * Usage:                                   1     2
 *
 * Options:          ControllerPath -> {Gamepad, Joystick, Detachable, 1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllerState
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllerState.html
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
fun controllerState(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllerState", arguments.toMutableList(), options)
}
