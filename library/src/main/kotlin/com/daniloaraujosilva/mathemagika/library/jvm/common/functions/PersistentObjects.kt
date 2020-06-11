package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PersistentObjects
 *
 * Full name:        System`PersistentObjects
 *
 *                   PersistentObjects[] gives all persistent objects in all locations in $PersistencePath.
 *                   PersistentObjects[patt] gives all persistent objects whose names match the string pattern patt.
 *                   PersistentObjects[patt, loc] gives all matching persistent objects in persistence location loc.
 *                   PersistentObjects[patt, {loc , …}] gives all matching persistent objects in all the loc .
 * Usage:                                        1                                                          i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PersistentObjects
 * Documentation:    web: http://reference.wolfram.com/language/ref/PersistentObjects.html
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
fun persistentObjects(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PersistentObjects", arguments.toMutableList(), options)
}
