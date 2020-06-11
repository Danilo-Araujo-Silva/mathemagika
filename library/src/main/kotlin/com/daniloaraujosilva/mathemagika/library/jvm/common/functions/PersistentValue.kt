package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PersistentValue
 *
 * Full name:        System`PersistentValue
 *
 *                   PersistentValue["name"] represents the persistent value associated with the key "name".
 *                   PersistentValue["name", loc] represents the persistent value associated with name stored in persistence location loc.
 *                   PersistentValue["name", {loc , …}] represents the persistent value associated with name at the first of the locations loc  at which it occurs.
 * Usage:                                        1                                                                                            i
 *
 *                   ExpirationDate -> None
 *                   MergingFunction -> Automatic
 *                   PersistenceTime -> None
 * Options:          ValuePreprocessingFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PersistentValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/PersistentValue.html
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
fun persistentValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PersistentValue", arguments.toMutableList(), options)
}
