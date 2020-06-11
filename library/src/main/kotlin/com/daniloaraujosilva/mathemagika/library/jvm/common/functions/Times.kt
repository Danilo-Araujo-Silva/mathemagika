package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Times
 *
 * Full name:        System`Times
 *
 * Usage:            x * y * z, x × y × z, or x y z represents a product of terms.
 *
 * Options:          None
 *
 *                   Flat
 *                   Listable
 *                   NumericFunction
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Times
 * Documentation:    web: http://reference.wolfram.com/language/ref/Times.html
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
 * Default value:    Default[Times] := 1
 *
 * Numeric values:   None
 */
fun times(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Times", arguments.toMutableList(), options)
}
