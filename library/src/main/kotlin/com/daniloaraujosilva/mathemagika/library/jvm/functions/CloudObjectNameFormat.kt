package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CloudObjectNameFormat
 *
 * Full name:        System`CloudObjectNameFormat
 *
 * Usage:            CloudObjectNameFormat is an option for CloudObject and related objects that determines how the name portion of the URL for the object should be formatted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CloudObjectNameFormat
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudObjectNameFormat.html
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
fun cloudObjectNameFormat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudObjectNameFormat", arguments.toMutableList(), options)
}
