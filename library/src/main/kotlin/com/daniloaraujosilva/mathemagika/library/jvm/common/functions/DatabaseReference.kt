package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DatabaseReference
 *
 * Full name:        System`DatabaseReference
 *
 *                   DatabaseReference[File["filename"]] represents a reference to a local file-based SQL database.
 *                   DatabaseReference[URL["url"]] represents a reference to a server-based SQL database.
 * Usage:            DatabaseReference[assoc] represents a fully specified reference to any SQL database.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DatabaseReference
 * Documentation:    web: http://reference.wolfram.com/language/ref/DatabaseReference.html
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
fun databaseReference(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatabaseReference", arguments.toMutableList(), options)
}
