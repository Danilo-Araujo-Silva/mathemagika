package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Composition
 *
 * Full name:        System`Composition
 *
 *                   Composition[f , f , f , …] represents a composition of the functions f , f , f , ….
 * Usage:                         1   2   3                                                1   2   3
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Composition
 * Documentation:    web: http://reference.wolfram.com/language/ref/Composition.html
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
fun composition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Composition", arguments.toMutableList(), options)
}
