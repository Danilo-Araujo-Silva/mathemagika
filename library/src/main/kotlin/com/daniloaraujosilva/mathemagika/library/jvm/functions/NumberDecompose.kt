package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NumberDecompose
 *
 * Full name:        System`NumberDecompose
 *
 *                   NumberDecompose[x, {u , …, u }] returns a list of coefficients {c , …, c } of a decomposition of the number x in the basis {u , …, u }.
 * Usage:                                 1      n                                    1      n                                                    1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NumberDecompose
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberDecompose.html
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
fun numberDecompose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberDecompose", arguments.toMutableList(), options)
}
