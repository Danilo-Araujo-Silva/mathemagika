package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EntityInstance
 *
 * Full name:        System`EntityInstance
 *
 *                   EntityInstance[entity, qual  val] represents an entity whose qualifier qual has value val.
 *                   EntityInstance[entity, {qual   val , qual   val , …}] represents an entity whose qualifiers qual  have values val .
 *                                               1      1      2      2                                                i                i
 * Usage:            EntityInstance[entity, quantity] represents an entity qualified by quantity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityInstance
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityInstance.html
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
fun entityInstance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityInstance", arguments.toMutableList(), options)
}
