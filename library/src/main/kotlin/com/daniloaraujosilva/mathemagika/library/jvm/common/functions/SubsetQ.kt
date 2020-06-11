package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SubsetQ
 *
 * Full name:        System`SubsetQ
 *
 *                   SubsetQ[list , list ] yields True if list  is a subset of list , and False otherwise.
 * Usage:                        1      2                     2                    1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubsetQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsetQ.html
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
fun subsetQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsetQ", arguments.toMutableList(), options)
}
