package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Iconize
 *
 * Full name:        System`Iconize
 *
 *                   Iconize[expr] gives an iconized form that can be used to stand in for expr in notebook input.
 * Usage:            Iconize[expr, "name"] displays with the specified name in the icon.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 *                   ReadProtected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/Iconize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Iconize.html
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
fun iconize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Iconize", arguments.toMutableList(), options)
}
