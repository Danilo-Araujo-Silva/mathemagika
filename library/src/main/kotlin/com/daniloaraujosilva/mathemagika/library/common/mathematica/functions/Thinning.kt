package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Thinning
 *
 * Full name:        System`Thinning
 *
 *                   Thinning[image] finds the skeletons of foreground regions in image by applying morphological thinning until convergence.
 *                   Thinning[image, n] performs n iterations of morphological thinning.
 * Usage:            Thinning[image, n, t] treats values above t as foreground.
 *
 *                   Padding -> 0
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Thinning
 * Documentation:    web: http://reference.wolfram.com/language/ref/Thinning.html
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
fun thinning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Thinning", arguments.toMutableList(), options)
}
