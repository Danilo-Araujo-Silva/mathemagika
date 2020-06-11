package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChampernowneNumber
 *
 * Full name:        System`ChampernowneNumber
 *
 *                   ChampernowneNumber[b] gives the base-b Champernowne number C .
 *                                                                               b
 * Usage:            ChampernowneNumber[] gives the base-10 Champernowne number.
 *
 * Options:          None
 *
 *                   Constant
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChampernowneNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChampernowneNumber.html
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
fun champernowneNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChampernowneNumber", arguments.toMutableList(), options)
}
