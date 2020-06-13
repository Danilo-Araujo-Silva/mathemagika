package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CloudImport
 *
 * Full name:        System`CloudImport
 *
 *                   CloudImport["uri"] imports from a cloud object at a given URI.
 *                   CloudImport["uri", elements] imports the specified elements of a cloud object.
 * Usage:            CloudImport[CloudObject["uri"]] imports from a given cloud object.
 *
 * Options:          CloudBase -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudImport
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudImport.html
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
fun cloudImport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudImport", arguments.toMutableList(), options)
}
