package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MemoryInUse
 * 
 * Full name:        System`MemoryInUse
 * 
 *                   MemoryInUse[] gives the number of bytes currently being used to store all data in the current Wolfram Language kernel session. 
 * Usage:            MemoryInUse[$FrontEnd] gives the number of bytes used in the Wolfram System front end.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MemoryInUse
 * Documentation:    web: http://reference.wolfram.com/language/ref/MemoryInUse.html
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
fun memoryInUse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MemoryInUse", arguments.toMutableList(), options)
}
