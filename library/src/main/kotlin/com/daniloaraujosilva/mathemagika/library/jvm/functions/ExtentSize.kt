package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ExtentSize
 *
 * Full name:        System`ExtentSize
 *
 * Usage:            ExtentSize is an option to DiscretePlot and DiscretePlot3D that specifies how far to extend out from each plot point.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExtentSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtentSize.html
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
fun extentSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtentSize", arguments.toMutableList(), options)
}
