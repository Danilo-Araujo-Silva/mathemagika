package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AffineHalfSpace
 *
 * Full name:        System`AffineHalfSpace
 *
 *                   AffineHalfSpace[{p , …, p     }, w] represents AffineSpace[{p , …, p     }] extended in the direction w.
 *                                     1      k + 1                               1      k + 1
 *                   AffineHalfSpace[p, {v , …, v }, w] represents AffineSpace[p, {v , …, v }] extended in the direction w.
 * Usage:                                 1      k                                  1      k
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AffineHalfSpace
 * Documentation:    web: http://reference.wolfram.com/language/ref/AffineHalfSpace.html
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
fun affineHalfSpace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AffineHalfSpace", arguments.toMutableList(), options)
}
