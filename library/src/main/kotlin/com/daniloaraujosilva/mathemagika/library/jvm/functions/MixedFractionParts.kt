package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MixedFractionParts
 *
 * Full name:        System`MixedFractionParts
 *
 * Usage:            MixedFractionParts[expr] gives the list {IntegerPart[expr], FractionalPart[expr]}.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MixedFractionParts
 * Documentation:    web: http://reference.wolfram.com/language/ref/MixedFractionParts.html
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
fun mixedFractionParts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MixedFractionParts", arguments.toMutableList(), options)
}
