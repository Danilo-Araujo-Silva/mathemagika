package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RotateRight
 * 
 * Full name:        System`RotateRight
 * 
 *                   RotateRight[expr, n] cycles the elements in expr n positions to the right. 
 *                   RotateRight[expr] cycles one position to the right. 
 *                   RotateRight[expr, {n , n , …}] cycles elements at successive levels n  positions to the right. 
 * Usage:                                1   2                                            i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RotateRight
 * Documentation:    web: http://reference.wolfram.com/language/ref/RotateRight.html
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
fun rotateRight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RotateRight", arguments.toMutableList(), options)
}
