package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Splice
 * 
 * Full name:        System`Splice
 * 
 *                   Splice[{e , e , …}] represents an expression that will automatically be spliced into any list in which it appears as the sequence of elements e . 
 * Usage:                     1   2                                                                                                                                 i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Splice
 * Documentation:    web: http://reference.wolfram.com/language/ref/Splice.html
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
fun splice(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Splice", arguments.toMutableList(), options)
}
