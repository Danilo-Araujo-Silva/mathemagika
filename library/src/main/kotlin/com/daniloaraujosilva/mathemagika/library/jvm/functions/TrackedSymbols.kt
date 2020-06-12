package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TrackedSymbols
 *
 * Full name:        System`TrackedSymbols
 *
 * Usage:            TrackedSymbols is an option to Refresh, Manipulate, and related functions that specifies which symbols should trigger updates when their values are changed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TrackedSymbols
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrackedSymbols.html
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
fun trackedSymbols(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrackedSymbols", arguments.toMutableList(), options)
}
