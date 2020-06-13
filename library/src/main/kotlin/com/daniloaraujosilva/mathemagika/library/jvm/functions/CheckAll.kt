package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CheckAll
 *
 * Full name:        System`CheckAll
 *
 *                   CheckAll[expr, f] evaluates expr and returns f[expr, HoldComplete[control , …]] where the control  expressions are aborts, throws, or other flow control commands currently being executed (but stopped by CheckAll).
 * Usage:                                                                                     1                       i
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun checkAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CheckAll", arguments.toMutableList(), options)
}
