package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Power
 *
 * Full name:        System`Power
 *
 * Usage:            x^y gives x to the power y.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Power
 * Documentation:    web: http://reference.wolfram.com/language/ref/Power.html
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
 * Default value:    Power /: Default[Power, 2] := 1
 *
 * Numeric values:   None
 */
fun power(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Power", arguments.toMutableList(), options)
}
