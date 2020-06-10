package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KeySortBy
 * 
 * Full name:        System`KeySortBy
 * 
 *                   KeySortBy[assoc, f] sorts the elements of an association in the order defined by applying f to each of their keys.
 * Usage:            KeySortBy[f] represents an operator form of KeySortBy that can be applied to an expression.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KeySortBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeySortBy.html
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
fun keySortBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeySortBy", arguments.toMutableList(), options)
}
