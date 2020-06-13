package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AppellF1
 *
 * Full name:        System`AppellF1
 *
 *                   AppellF1[a, b , b , c, x, y] is the Appell hypergeometric function of two variables F  (a ; b , b  ; c ; x, y).
 * Usage:                         1   2                                                                   1       1   2
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AppellF1
 * Documentation:    web: http://reference.wolfram.com/language/ref/AppellF1.html
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
fun appellF1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AppellF1", arguments.toMutableList(), options)
}
