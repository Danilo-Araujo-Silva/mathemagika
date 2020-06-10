package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PersistenceTime
 * 
 * Full name:        System`PersistenceTime
 * 
 * Usage:            PersistenceTime is an option for various functions that specifies when a persistent value should be treated as expired.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PersistenceTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/PersistenceTime.html
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
fun persistenceTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PersistenceTime", arguments.toMutableList(), options)
}
