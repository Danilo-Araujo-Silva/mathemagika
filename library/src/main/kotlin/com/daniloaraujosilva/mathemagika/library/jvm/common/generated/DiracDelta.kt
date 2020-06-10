package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DiracDelta
 * 
 * Full name:        System`DiracDelta
 * 
 *                   DiracDelta[x] represents the Dirac delta function δ(x). 
 *                   DiracDelta[x , x , …] represents the multidimensional Dirac delta function δ(x , x , …). 
 * Usage:                        1   2                                                             1   2
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Orderless
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DiracDelta
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiracDelta.html
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
fun diracDelta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiracDelta", arguments.toMutableList(), options)
}
