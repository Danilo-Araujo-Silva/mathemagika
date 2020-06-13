package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CachePersistence
 *
 * Full name:        System`CachePersistence
 *
 * Usage:            CachePersistence is an option to Delayed and related constructs that specifies how long to keep server-side cached versions of computations that are done.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CachePersistence
 * Documentation:    web: http://reference.wolfram.com/language/ref/CachePersistence.html
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
fun cachePersistence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CachePersistence", arguments.toMutableList(), options)
}
