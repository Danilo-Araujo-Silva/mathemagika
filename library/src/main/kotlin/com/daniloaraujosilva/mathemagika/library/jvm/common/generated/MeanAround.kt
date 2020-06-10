package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MeanAround
 * 
 * Full name:        System`MeanAround
 * 
 *                   MeanAround[{x , x , x , …}] gives an Around object describing the mean of the x  and its uncertainty.
 *                                1   2   3                                                         i
 *                   MeanAround[{{x  , x  , …}, {x  , …}, …}] gives a VectorAround object describing the means of the vectors x  and their covariance. 
 * Usage:                          11   12        21                                                                           i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MeanAround
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanAround.html
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
fun meanAround(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanAround", arguments.toMutableList(), options)
}
