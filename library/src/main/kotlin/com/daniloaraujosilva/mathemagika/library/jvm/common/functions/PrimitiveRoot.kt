package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrimitiveRoot
 *
 * Full name:        System`PrimitiveRoot
 *
 *                   PrimitiveRoot[n] gives a primitive root of n.
 * Usage:            PrimitiveRoot[n, k] gives the smallest primitive root of n greater than or equal to k.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrimitiveRoot
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimitiveRoot.html
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
fun primitiveRoot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimitiveRoot", arguments.toMutableList(), options)
}
