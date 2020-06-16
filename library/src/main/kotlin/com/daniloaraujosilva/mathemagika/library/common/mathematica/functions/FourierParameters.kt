package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FourierParameters
 *
 * Full name:        System`FourierParameters
 *
 * Usage:            FourierParameters is an option to Fourier and related functions that specifies the conventions to use in computing Fourier transforms.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierParameters
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierParameters.html
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
fun fourierParameters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierParameters", arguments.toMutableList(), options)
}
