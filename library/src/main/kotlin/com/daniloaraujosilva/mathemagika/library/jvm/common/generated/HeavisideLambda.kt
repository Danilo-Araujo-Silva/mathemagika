package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HeavisideLambda
 * 
 * Full name:        System`HeavisideLambda
 * 
 *                   HeavisideLambda[x] represents the triangle distribution Λ(x) which is nonzero for  x  < 1.
 *                   HeavisideLambda[x , x , …] represents the multidimensional triangle distribution Λ(x , x , …) which is nonzero for  x   < 1.
 * Usage:                             1   2                                                              1   2                             i
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HeavisideLambda
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeavisideLambda.html
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
fun heavisideLambda(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeavisideLambda", arguments.toMutableList(), options)
}
