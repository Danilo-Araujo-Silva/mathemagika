package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DownArrowBar
 * 
 * Full name:        System`DownArrowBar
 * 
 * Usage:            DownArrowBar[x, y, …] displays as x ⤓ y ⤓ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/DownArrowBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownArrowBar.html
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
fun downArrowBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownArrowBar", arguments.toMutableList(), options)
}
