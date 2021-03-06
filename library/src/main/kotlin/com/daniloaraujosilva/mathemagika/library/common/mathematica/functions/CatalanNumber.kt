package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CatalanNumber
 *
 * Full name:        System`CatalanNumber
 *
 *                                                th
 *                   CatalanNumber[n] gives the n   Catalan number C .
 * Usage:                                                            n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CatalanNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/CatalanNumber.html
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
fun catalanNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CatalanNumber", arguments.toMutableList(), options)
}
