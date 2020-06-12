package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RudvalisGroupRu
 *
 * Full name:        System`RudvalisGroupRu
 *
 * Usage:            RudvalisGroupRu[] represents the sporadic simple Rudvalis group Ru.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RudvalisGroupRu
 * Documentation:    web: http://reference.wolfram.com/language/ref/RudvalisGroupRu.html
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
fun rudvalisGroupRu(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RudvalisGroupRu", arguments.toMutableList(), options)
}
