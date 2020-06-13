package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GaugeFaceElementFunction
 *
 * Full name:        System`GaugeFaceElementFunction
 *
 * Usage:            GaugeFaceElementFunction is an option for gauge functions that gives a function to use to generate the primitives for rendering the gauge face.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaugeFaceElementFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaugeFaceElementFunction.html
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
fun gaugeFaceElementFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaugeFaceElementFunction", arguments.toMutableList(), options)
}
