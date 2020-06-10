package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Max
 * 
 * Full name:        System`Max
 * 
 *                   Max[x , x , …] yields the numerically largest of the x . 
 *                        1   2                                            i
 *                   Max[{x , x , …}, {y , …}, …] yields the largest element of any of the lists. 
 * Usage:                  1   2        1
 * 
 * Options:          None
 * 
 *                   Flat
 *                   NumericFunction
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Max
 * Documentation:    web: http://reference.wolfram.com/language/ref/Max.html
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
fun max(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Max", arguments.toMutableList(), options)
}
