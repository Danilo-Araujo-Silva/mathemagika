package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NyquistGridLines
 *
 * Full name:        System`NyquistGridLines
 *
 * Usage:            NyquistGridLines is an option to NyquistPlot that specifies contours of constant magnitude and phase of a closed-loop system.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NyquistGridLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/NyquistGridLines.html
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
fun nyquistGridLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NyquistGridLines", arguments.toMutableList(), options)
}
