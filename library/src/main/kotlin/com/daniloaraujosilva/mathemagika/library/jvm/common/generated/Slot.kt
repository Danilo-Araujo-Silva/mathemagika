package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Slot
 * 
 * Full name:        System`Slot
 * 
 *                   # represents the first argument supplied to a pure function. 
 *                                        th
 *                   #n represents the n   argument. 
 * Usage:            #name represents the value associated with key "name" in an association in the first argument. 
 * 
 * Options:          None
 * 
 *                   NHoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Slot
 * Documentation:    web: http://reference.wolfram.com/language/ref/Slot.html
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
fun slot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Slot", arguments.toMutableList(), options)
}
