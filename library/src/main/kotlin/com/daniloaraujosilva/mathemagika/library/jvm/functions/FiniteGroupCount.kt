package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FiniteGroupCount
 *
 * Full name:        System`FiniteGroupCount
 *
 * Usage:            FiniteGroupCount[n] gives the number of finite groups of order n.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FiniteGroupCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/FiniteGroupCount.html
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
fun finiteGroupCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FiniteGroupCount", arguments.toMutableList(), options)
}
