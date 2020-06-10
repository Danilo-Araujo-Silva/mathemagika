package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HankelMatrix
 * 
 * Full name:        System`HankelMatrix
 * 
 *                   HankelMatrix[n] gives the n×n Hankel matrix with first row and first column being successive integers.
 *                   HankelMatrix[{c , c , …, c }] gives the Hankel matrix whose first column consists of elements c , c , ….
 *                                  1   2      n                                                                    1   2
 *                   HankelMatrix[{c , c , …, c }, {r , r , …, r }] gives the Hankel matrix with elements c  down the first column, and r  across the last row.
 * Usage:                           1   2      m     1   2      n                                          i                             i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/HankelMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/HankelMatrix.html
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
fun hankelMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HankelMatrix", arguments.toMutableList(), options)
}
