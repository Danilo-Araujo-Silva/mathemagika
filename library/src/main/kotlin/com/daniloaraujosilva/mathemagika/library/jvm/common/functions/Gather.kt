package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Gather
 *
 * Full name:        System`Gather
 *
 *                   Gather[list] gathers the elements of list into sublists of identical elements.
 * Usage:            Gather[list, test] applies test to pairs of elements to determine if they should be considered identical.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Gather
 * Documentation:    web: http://reference.wolfram.com/language/ref/Gather.html
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
fun gather(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Gather", arguments.toMutableList(), options)
}
