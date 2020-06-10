package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SquareSubset
 * 
 * Full name:        System`SquareSubset
 * 
 * Usage:            SquareSubset[x, y, …] displays as x ⊏ y ⊏ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/SquareSubset
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareSubset.html
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
fun squareSubset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareSubset", arguments.toMutableList(), options)
}
