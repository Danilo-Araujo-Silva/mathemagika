package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CapsuleShape
 *
 * Full name:        System`CapsuleShape
 *
 *                   CapsuleShape[{{x , y , z }, {x , y , z }}, r] represents the filled capsule between points {x , y , z } and radius r.
 * Usage:                            1   1   1     2   2   2                                                      i   i   i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CapsuleShape
 * Documentation:    web: http://reference.wolfram.com/language/ref/CapsuleShape.html
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
fun capsuleShape(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CapsuleShape", arguments.toMutableList(), options)
}
