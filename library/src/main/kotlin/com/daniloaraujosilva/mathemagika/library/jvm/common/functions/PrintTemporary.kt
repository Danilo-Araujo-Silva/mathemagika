package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrintTemporary
 *
 * Full name:        System`PrintTemporary
 *
 * Usage:            PrintTemporary[expr] prints expr as a temporary cell in a notebook, removing it when the evaluation of the current input line is complete.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrintTemporary
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrintTemporary.html
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
fun printTemporary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrintTemporary", arguments.toMutableList(), options)
}
