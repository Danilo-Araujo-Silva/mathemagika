package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RotationAction
 *
 * Full name:        System`RotationAction
 *
 * Usage:            RotationAction is an option for three-dimensional graphics functions that specifies how to render 3D objects when they are interactively rotated.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RotationAction
 * Documentation:    web: http://reference.wolfram.com/language/ref/RotationAction.html
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
fun rotationAction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RotationAction", arguments.toMutableList(), options)
}
