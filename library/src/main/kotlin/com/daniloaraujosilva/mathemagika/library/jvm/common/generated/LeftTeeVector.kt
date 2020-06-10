package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LeftTeeVector
 * 
 * Full name:        System`LeftTeeVector
 * 
 * Usage:            LeftTeeVector[x, y, …] displays as x ⥚ y ⥚ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/LeftTeeVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftTeeVector.html
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
fun leftTeeVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftTeeVector", arguments.toMutableList(), options)
}
