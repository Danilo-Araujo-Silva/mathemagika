package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DiracComb
 * 
 * Full name:        System`DiracComb
 * 
 *                   DiracComb[x] represents the Dirac comb function (x) giving a delta function at every integer point. 
 *                   DiracComb[x , x , …] represents the multidimensional Dirac comb function (x , x , …).
 * Usage:                       1   2                                                            1   2
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DiracComb
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiracComb.html
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
fun diracComb(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiracComb", arguments.toMutableList(), options)
}
