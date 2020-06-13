package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModelProgressReporting
 *
 * Full name:        System`SystemModelProgressReporting
 *
 * Usage:            SystemModelProgressReporting is an option for SystemModelSimulate and related functions that specifies how to report progress.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModelProgressReporting
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelProgressReporting.html
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
fun systemModelProgressReporting(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelProgressReporting", arguments.toMutableList(), options)
}
