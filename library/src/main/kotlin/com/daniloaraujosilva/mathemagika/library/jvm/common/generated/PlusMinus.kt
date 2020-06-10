package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PlusMinus
 * 
 * Full name:        System`PlusMinus
 * 
 *                   PlusMinus[x] displays as ± x.
 * Usage:            PlusMinus[x, y, …] displays as x ± y ± ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/PlusMinus
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlusMinus.html
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
fun plusMinus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlusMinus", arguments.toMutableList(), options)
}
