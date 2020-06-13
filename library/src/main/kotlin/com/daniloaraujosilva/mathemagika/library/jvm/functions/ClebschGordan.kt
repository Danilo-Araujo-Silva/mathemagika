package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ClebschGordan
 *
 * Full name:        System`ClebschGordan
 *
 *                   ClebschGordan[{j , m }, {j , m }, {j, m}] gives the Clebsch–Gordan coefficient for the decomposition of  j, m 〉 in terms of  j , m  〉  j , m  〉.
 * Usage:                            1   1     2   2                                                                                                 1   1      2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ClebschGordan
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClebschGordan.html
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
fun clebschGordan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClebschGordan", arguments.toMutableList(), options)
}
