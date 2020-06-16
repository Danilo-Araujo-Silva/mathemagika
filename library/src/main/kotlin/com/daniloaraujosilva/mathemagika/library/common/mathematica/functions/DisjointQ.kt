package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DisjointQ
 *
 * Full name:        System`DisjointQ
 *
 *                   DisjointQ[list , list ] yields True if list  and list  do not share any common elements, and False otherwise.
 * Usage:                          1      2                     1         2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DisjointQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisjointQ.html
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
fun disjointQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisjointQ", arguments.toMutableList(), options)
}
