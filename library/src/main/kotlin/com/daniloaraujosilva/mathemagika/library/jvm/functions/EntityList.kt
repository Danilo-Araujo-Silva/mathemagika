package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EntityList
 *
 * Full name:        System`EntityList
 *
 *                   EntityList[class] gives a list of entities in the specified entity class.
 *                   EntityList["type"] gives a list of entities of the specified type.
 * Usage:            EntityList[class, simplify] gives a list of entities; simplify determines whether to reduce entities to the simplest possible type.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityList
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityList.html
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
fun entityList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityList", arguments.toMutableList(), options)
}
