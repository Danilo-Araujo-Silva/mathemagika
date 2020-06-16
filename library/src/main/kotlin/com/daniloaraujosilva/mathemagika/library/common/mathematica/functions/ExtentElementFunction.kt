package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExtentElementFunction
 *
 * Full name:        System`ExtentElementFunction
 *
 * Usage:            ExtentElementFunction is an option to DiscretePlot and DiscretePlot3D that gives a function to use to generate the primitives for rendering each extent element.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExtentElementFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtentElementFunction.html
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
fun extentElementFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtentElementFunction", arguments.toMutableList(), options)
}
