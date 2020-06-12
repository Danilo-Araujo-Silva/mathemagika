package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Commonest
 *
 * Full name:        System`Commonest
 *
 *                   Commonest[list] gives a list of the elements that are the most common in list.
 * Usage:            Commonest[list, n] gives a list of the n most common elements in list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Commonest
 * Documentation:    web: http://reference.wolfram.com/language/ref/Commonest.html
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
fun commonest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Commonest", arguments.toMutableList(), options)
}
