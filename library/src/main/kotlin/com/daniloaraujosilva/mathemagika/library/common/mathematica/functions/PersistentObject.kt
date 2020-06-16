package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PersistentObject
 *
 * Full name:        System`PersistentObject
 *
 * Usage:            PersistentObject["name", loc] represents a persistent object stored at persistence location loc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PersistentObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/PersistentObject.html
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
fun persistentObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PersistentObject", arguments.toMutableList(), options)
}
