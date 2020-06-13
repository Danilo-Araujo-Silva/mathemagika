package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DistributedContexts
 *
 * Full name:        System`DistributedContexts
 *
 * Usage:            DistributedContexts is an option for various parallel computing functions that specifies which definitions for symbols appearing in an expression should be distributed to all parallel kernels.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DistributedContexts
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistributedContexts.html
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
fun distributedContexts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistributedContexts", arguments.toMutableList(), options)
}
