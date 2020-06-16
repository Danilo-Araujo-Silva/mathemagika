package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EntityRegister
 *
 * Full name:        System`EntityRegister
 *
 * Usage:            EntityRegister[estore] registers the entities in the entity store estore so that they can be accessed directly using Entity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityRegister
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityRegister.html
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
fun entityRegister(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityRegister", arguments.toMutableList(), options)
}
