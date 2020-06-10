package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Offset
 * 
 * Full name:        System`Offset
 * 
 * Usage:            Offset[{dx, dy}, position] gives the position of a graphical object obtained by starting at the specified position and then moving by absolute offset {dx, dy}. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Offset
 * Documentation:    web: http://reference.wolfram.com/language/ref/Offset.html
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
fun offset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Offset", arguments.toMutableList(), options)
}
