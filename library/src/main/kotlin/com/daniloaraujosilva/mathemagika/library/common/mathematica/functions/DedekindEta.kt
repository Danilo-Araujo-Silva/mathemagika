package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DedekindEta
 *
 * Full name:        System`DedekindEta
 *
 * Usage:            DedekindEta[τ] gives the Dedekind eta modular elliptic function η(τ).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DedekindEta
 * Documentation:    web: http://reference.wolfram.com/language/ref/DedekindEta.html
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
fun dedekindEta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DedekindEta", arguments.toMutableList(), options)
}
