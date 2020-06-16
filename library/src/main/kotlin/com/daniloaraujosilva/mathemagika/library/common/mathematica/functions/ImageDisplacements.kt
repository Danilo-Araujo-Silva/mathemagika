package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageDisplacements
 *
 * Full name:        System`ImageDisplacements
 *
 *                   ImageDisplacements[{image , image , …, image }] gives estimated horizontal and vertical displacements between consecutive images.
 *                                            1       2          n
 *                   ImageDisplacements[{image , image , …, image }, flow] uses flow as an initial estimate for displacement between image  and image .
 * Usage:                                     1       2          n                                                                        1          2
 *
 * Options:          MaxIterations -> 10
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageDisplacements
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageDisplacements.html
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
fun imageDisplacements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageDisplacements", arguments.toMutableList(), options)
}
