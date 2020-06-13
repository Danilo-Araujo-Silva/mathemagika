package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ConstantArray
 *
 * Full name:        System`ConstantArray
 *
 *                   ConstantArray[c, n] generates a list of n copies of the element c.
 *                   ConstantArray[c, {n , n , …}] generates an n   n   … array of nested lists containing copies of the element c.
 * Usage:                               1   2                    1    2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConstantArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConstantArray.html
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
fun constantArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConstantArray", arguments.toMutableList(), options)
}
