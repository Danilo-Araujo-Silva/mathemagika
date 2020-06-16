package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalStorageObject
 *
 * Full name:        System`ExternalStorageObject
 *
 *                   ExternalStorageObject[location] represents a file stored in an external location.
 *                   ExternalStorageObject[assoc] represents a file stored in an external service specified by the components of the association assoc.
 * Usage:            ExternalStorageObject[location, assoc] represents a file stored in an external location with additional elements given by assoc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalStorageObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalStorageObject.html
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
fun externalStorageObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalStorageObject", arguments.toMutableList(), options)
}
