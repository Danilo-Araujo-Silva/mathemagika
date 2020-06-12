package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocalObjects
 *
 * Full name:        System`LocalObjects
 *
 *                   LocalObjects[] gives a list of local objects in your current local base directory.
 * Usage:            LocalObjects[dir] gives a list of local objects in the local directory dir.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocalObjects
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalObjects.html
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
fun localObjects(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalObjects", arguments.toMutableList(), options)
}
