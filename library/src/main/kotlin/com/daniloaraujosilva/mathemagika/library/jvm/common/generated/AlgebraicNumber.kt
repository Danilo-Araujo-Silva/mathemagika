package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AlgebraicNumber
 * 
 * Full name:        System`AlgebraicNumber
 * 
 *                                                                                                                                      n
 *                   AlgebraicNumber[θ, {c , c , …, c }] represents the algebraic number in the field [θ] given by c  + c  θ + … + c  θ .
 * Usage:                                 0   1      n                                                               0    1          n
 * 
 * Options:          None
 * 
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AlgebraicNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlgebraicNumber.html
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
fun algebraicNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlgebraicNumber", arguments.toMutableList(), options)
}
