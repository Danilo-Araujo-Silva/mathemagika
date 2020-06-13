package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VersionedPreferences
 *
 * Full name:        System`VersionedPreferences
 *
 * Usage:            VersionedPreferences is a global front end option that specifies whether settings on $FrontEnd should be sandboxed to specific versions of the Wolfram System.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VersionedPreferences
 * Documentation:    web: http://reference.wolfram.com/language/ref/VersionedPreferences.html
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
fun versionedPreferences(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VersionedPreferences", arguments.toMutableList(), options)
}
