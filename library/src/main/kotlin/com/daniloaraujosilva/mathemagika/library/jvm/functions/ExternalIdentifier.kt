package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalIdentifier
 *
 * Full name:        System`ExternalIdentifier
 *
 *                   ExternalIdentifier["type", id] represents a resource identified by id in the external identifier system "type".
 * Usage:            ExternalIdentifier["type", id, meta] includes the metadata given by the association meta to this instance of the external identifier object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalIdentifier
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalIdentifier.html
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
fun externalIdentifier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalIdentifier", arguments.toMutableList(), options)
}
