package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FiniteAbelianGroupCount
 *
 * Full name:        System`FiniteAbelianGroupCount
 *
 * Usage:            FiniteAbelianGroupCount[n] gives the number of finite Abelian groups of order n.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FiniteAbelianGroupCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/FiniteAbelianGroupCount.html
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
fun finiteAbelianGroupCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FiniteAbelianGroupCount", arguments.toMutableList(), options)
}
