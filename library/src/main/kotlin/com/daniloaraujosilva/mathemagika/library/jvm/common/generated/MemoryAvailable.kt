package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MemoryAvailable
 * 
 * Full name:        System`MemoryAvailable
 * 
 * Usage:            MemoryAvailable[] gives the estimated number of bytes readily available for storing additional data in the current Wolfram Language kernel session.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MemoryAvailable
 * Documentation:    web: http://reference.wolfram.com/language/ref/MemoryAvailable.html
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
fun memoryAvailable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MemoryAvailable", arguments.toMutableList(), options)
}
