package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DihedralAngle
 *
 * Full name:        System`DihedralAngle
 *
 *                   DihedralAngle[{p , p }, {v, w}] gives the angle between two half-planes bounded by the line through p  and p  and extended in the direction v and w.
 * Usage:                            1   2                                                                                1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DihedralAngle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DihedralAngle.html
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
fun dihedralAngle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DihedralAngle", arguments.toMutableList(), options)
}
