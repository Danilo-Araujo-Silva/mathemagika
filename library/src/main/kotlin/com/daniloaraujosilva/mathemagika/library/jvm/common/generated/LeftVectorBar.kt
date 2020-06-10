package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LeftVectorBar
 * 
 * Full name:        System`LeftVectorBar
 * 
 * Usage:            LeftVectorBar[x, y, …] displays as x ⥒ y ⥒ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/LeftVectorBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftVectorBar.html
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
fun leftVectorBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftVectorBar", arguments.toMutableList(), options)
}
