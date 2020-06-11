package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RootOfUnityQ
 *
 * Full name:        System`RootOfUnityQ
 *
 * Usage:            RootOfUnityQ[a] yields True if a is a root of unity, and yields False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RootOfUnityQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/RootOfUnityQ.html
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
fun rootOfUnityQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RootOfUnityQ", arguments.toMutableList(), options)
}
