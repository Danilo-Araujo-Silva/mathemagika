package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EntityUnregister
 *
 * Full name:        System`EntityUnregister
 *
 *                   EntityUnregister["type"] unregisters all entities in the first entity store that defines entities of the specified type.
 * Usage:            EntityUnregister[store] unregisters all entities in the specified entity store.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityUnregister
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityUnregister.html
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
fun entityUnregister(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityUnregister", arguments.toMutableList(), options)
}
