package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RotateLeft
 *
 * Full name:        System`RotateLeft
 *
 *                   RotateLeft[expr, n] cycles the elements in expr n positions to the left.
 *                   RotateLeft[expr] cycles one position to the left.
 *                   RotateLeft[expr, {n , n , …}] cycles elements at successive levels n  positions to the left.
 * Usage:                               1   2                                            i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RotateLeft
 * Documentation:    web: http://reference.wolfram.com/language/ref/RotateLeft.html
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
fun rotateLeft(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RotateLeft", arguments.toMutableList(), options)
}
