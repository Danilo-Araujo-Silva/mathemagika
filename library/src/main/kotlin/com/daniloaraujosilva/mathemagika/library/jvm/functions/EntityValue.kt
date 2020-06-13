package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EntityValue
 *
 * Full name:        System`EntityValue
 *
 *                   EntityValue[entity, property] gives the value of the specified property for the given entity.
 *                   EntityValue[{entity , entity , …}, property] gives the list of values of the specified property for each of the entity .
 *                                      1        2                                                                                         i
 *                   EntityValue[class, property] gives the list of values of the specified property for all entities in the specified class.
 *                   EntityValue[entity, {property , property , …}] gives the list of values of the property  for the specified entity.
 *                                                1          2                                              i
 *                   EntityValue[ents, {property , property , …}] gives the list of values of the property  for each of the entities represented by ents.
 * Usage:                                       1          2                                              i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityValue.html
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
fun entityValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityValue", arguments.toMutableList(), options)
}
