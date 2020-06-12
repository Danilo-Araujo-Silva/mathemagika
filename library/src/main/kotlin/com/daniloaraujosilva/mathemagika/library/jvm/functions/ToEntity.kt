package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToEntity
 *
 * Full name:        System`ToEntity
 *
 *                   ToEntity[expr] returns an entity object corresponding to the given expression.
 * Usage:            ToEntity[expr, type] returns an entity object of the specified type corresponding to expr.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToEntity
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToEntity.html
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
fun toEntity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToEntity", arguments.toMutableList(), options)
}
