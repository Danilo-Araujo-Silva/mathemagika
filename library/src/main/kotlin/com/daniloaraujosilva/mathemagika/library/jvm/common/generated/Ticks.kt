package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Ticks
 * 
 * Full name:        System`Ticks
 * 
 * Usage:            Ticks is an option for graphics functions that specifies tick marks for axes. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Ticks
 * Documentation:    web: http://reference.wolfram.com/language/ref/Ticks.html
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
fun ticks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Ticks", arguments.toMutableList(), options)
}
