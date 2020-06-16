package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VoigtDistribution
 *
 * Full name:        System`VoigtDistribution
 *
 * Usage:            VoigtDistribution[δ, σ] represents Voigt distribution with parameters δ and σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VoigtDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/VoigtDistribution.html
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
fun voigtDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VoigtDistribution", arguments.toMutableList(), options)
}
