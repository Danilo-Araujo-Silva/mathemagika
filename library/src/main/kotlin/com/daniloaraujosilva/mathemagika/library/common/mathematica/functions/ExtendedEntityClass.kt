package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExtendedEntityClass
 *
 * Full name:        System`ExtendedEntityClass
 *
 *                   ExtendedEntityClass[class, "name"  f] represents an entity class derived from class by adding a new computed property "name" whose value for each entity is obtained by applying the entity function f.
 *                   ExtendedEntityClass[class, {name   f , name   f , …}] adds the properties name  defined by the functions f .
 * Usage:                                            1    1      2    2                              i                           i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExtendedEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtendedEntityClass.html
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
fun extendedEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtendedEntityClass", arguments.toMutableList(), options)
}
