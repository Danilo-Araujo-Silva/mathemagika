package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PrimitiveRootList
 *
 * Full name:        System`PrimitiveRootList
 *
 * Usage:            PrimitiveRootList[n] gives a list of primitive roots of n.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrimitiveRootList
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimitiveRootList.html
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
fun primitiveRootList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimitiveRootList", arguments.toMutableList(), options)
}
