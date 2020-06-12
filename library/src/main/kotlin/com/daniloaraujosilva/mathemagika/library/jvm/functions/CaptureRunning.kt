package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CaptureRunning
 *
 * Full name:        System`CaptureRunning
 *
 * Usage:            CaptureRunning is an option for signal acquisition functions that specifies whether to immediately start the capture.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CaptureRunning
 * Documentation:    web: http://reference.wolfram.com/language/ref/CaptureRunning.html
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
fun captureRunning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CaptureRunning", arguments.toMutableList(), options)
}
