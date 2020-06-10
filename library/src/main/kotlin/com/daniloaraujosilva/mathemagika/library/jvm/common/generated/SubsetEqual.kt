package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SubsetEqual
 * 
 * Full name:        System`SubsetEqual
 * 
 * Usage:            SubsetEqual[x, y, …] displays as x ⊆ y ⊆ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/SubsetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsetEqual.html
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
fun subsetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsetEqual", arguments.toMutableList(), options)
}
