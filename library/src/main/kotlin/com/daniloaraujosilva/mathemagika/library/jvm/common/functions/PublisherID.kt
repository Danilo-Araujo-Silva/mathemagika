package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PublisherID
 *
 * Full name:        System`PublisherID
 *
 * Usage:            PublisherID is an option for ResourceSubmit that specifies the ID used to submit a resource for publication in the resource system.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PublisherID
 * Documentation:    web: http://reference.wolfram.com/language/ref/PublisherID.html
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
fun publisherID(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PublisherID", arguments.toMutableList(), options)
}
