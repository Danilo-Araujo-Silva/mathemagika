package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UnitBox
 *
 * Full name:        System`UnitBox
 *
 *                                                                                       1
 *                   UnitBox[x] represents the unit box function, equal to 1 for  x  ≤ - and 0 otherwise.
 *                                                                                       2
 *                                                                                                                1
 *                   UnitBox[x , x , …] represents the multidimensional unit box function, equal to 1 if  x   ≤ - and 0 otherwise.
 * Usage:                     1   2                                                                         i     2
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnitBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitBox.html
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
fun unitBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitBox", arguments.toMutableList(), options)
}
