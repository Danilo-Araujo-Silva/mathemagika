package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HitMissTransform
 *
 * Full name:        System`HitMissTransform
 *
 *                   HitMissTransform[image, ker] gives the hit-and-miss transform of image with respect to the composite structuring element ker.
 *                   HitMissTransform[image, {ker , ker , …}] gives the union of the hit-and-miss transforms for all the structuring elements ker .
 *                                               1     2                                                                                         i
 *                   HitMissTransform[image, {ker , ker , …}, t] treats values above t as foreground.
 * Usage:                                        1     2
 *
 * Options:          Padding -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HitMissTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/HitMissTransform.html
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
fun hitMissTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HitMissTransform", arguments.toMutableList(), options)
}
