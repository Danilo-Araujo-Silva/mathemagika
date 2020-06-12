package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImplicitRegion
 *
 * Full name:        System`ImplicitRegion
 *
 *                                                                             n
 *                   ImplicitRegion[cond, {x , …, x }] represents a region in   that satisfies the conditions cond.
 *                                          1      n
 *                                                                                   n
 *                   ImplicitRegion[cond, {{x , a , b }, …}] represents a region in   that satisfies the conditions cond as well as a  ≤ x  ≤ b  etc.
 * Usage:                                    1   1   1                                                                                1    1    1
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImplicitRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImplicitRegion.html
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
fun implicitRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImplicitRegion", arguments.toMutableList(), options)
}
