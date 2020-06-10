package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Sequence
 * 
 * Full name:        System`Sequence
 * 
 *                   Sequence[expr , expr , …] represents a sequence of arguments to be spliced automatically into any function. 
 * Usage:                         1      2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Sequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sequence.html
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
fun sequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sequence", arguments.toMutableList(), options)
}
