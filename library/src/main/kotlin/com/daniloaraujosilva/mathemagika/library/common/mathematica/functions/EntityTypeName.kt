package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EntityTypeName
 *
 * Full name:        System`EntityTypeName
 *
 *                   EntityTypeName[entity] gives the name of the entity type of entity.
 *                   EntityTypeName[{entity , …, entity }] gives the name of the entity type for entity  through entity .
 * Usage:                                  1           n                                               1               n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityTypeName
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityTypeName.html
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
fun entityTypeName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityTypeName", arguments.toMutableList(), options)
}
