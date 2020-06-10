package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             OverDot
 * 
 * Full name:        System`OverDot
 * 
 * Usage:            OverDot[expr] displays with a dot over expr.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/OverDot
 * Documentation:    web: http://reference.wolfram.com/language/ref/OverDot.html
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
fun overDot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OverDot", arguments.toMutableList(), options)
}
