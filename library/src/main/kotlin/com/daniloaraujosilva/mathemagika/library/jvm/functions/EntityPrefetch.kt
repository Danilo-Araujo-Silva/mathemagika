package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EntityPrefetch
 *
 * Full name:        System`EntityPrefetch
 *
 *                   EntityPrefetch["type"] fetches cacheable values associated with all entities of the specified type.
 * Usage:            EntityPrefetch[EntityProperty["type", "prop"]] fetches all values for the specified property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityPrefetch
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityPrefetch.html
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
 * Default value:    Options[EntityPrefetch] := (Unprotect[EntityPrefetch]; Options[EntityPrefetch] = {CloudBase -> Automatic})
 *
 * Numeric values:   None
 */
fun entityPrefetch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityPrefetch", arguments.toMutableList(), options)
}
