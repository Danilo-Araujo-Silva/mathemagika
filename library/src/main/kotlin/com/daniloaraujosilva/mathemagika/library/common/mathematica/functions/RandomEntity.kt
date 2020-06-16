package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RandomEntity
 *
 * Full name:        System`RandomEntity
 *
 *                   RandomEntity[spec] gives a pseudorandom entity with a type determined by the specification spec.
 * Usage:            RandomEntity[spec, n] gives a list of n pseudorandom entities.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomEntity
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomEntity.html
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
fun randomEntity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomEntity", arguments.toMutableList(), options)
}
