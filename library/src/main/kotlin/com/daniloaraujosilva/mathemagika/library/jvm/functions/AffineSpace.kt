package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AffineSpace
 *
 * Full name:        System`AffineSpace
 *
 *                   AffineSpace[{p , …, p     }] represents the affine space passing through the points p .
 *                                 1      k + 1                                                           i
 *                   AffineSpace[p, {v , …, v }] represents the affine space passing through p in the directions v .
 * Usage:                             1      k                                                                    i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AffineSpace
 * Documentation:    web: http://reference.wolfram.com/language/ref/AffineSpace.html
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
fun affineSpace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AffineSpace", arguments.toMutableList(), options)
}
