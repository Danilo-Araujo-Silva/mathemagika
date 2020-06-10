package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NotLessGreater
 * 
 * Full name:        System`NotLessGreater
 * 
 * Usage:            NotLessGreater[x, y, …] displays as x ≸ y ≸ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/NotLessGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotLessGreater.html
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
fun notLessGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotLessGreater", arguments.toMutableList(), options)
}
