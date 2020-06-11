package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Plus
 *
 * Full name:        System`Plus
 *
 * Usage:            x + y + z represents a sum of terms.
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
 *                   local: paclet:ref/Plus
 * Documentation:    web: http://reference.wolfram.com/language/ref/Plus.html
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
 * Default value:    Default[Plus] := 0
 *
 * Numeric values:   None
 */
fun plus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Plus", arguments.toMutableList(), options)
}
