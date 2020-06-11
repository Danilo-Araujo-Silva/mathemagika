package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbelianGroup
 *
 * Full name:        System`AbelianGroup
 *
 *                   AbelianGroup[{n , n , …}] represents the direct product of the cyclic groups of degrees n , n , ….
 * Usage:                           1   2                                                                     1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbelianGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbelianGroup.html
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
fun abelianGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbelianGroup", arguments.toMutableList(), options)
}
