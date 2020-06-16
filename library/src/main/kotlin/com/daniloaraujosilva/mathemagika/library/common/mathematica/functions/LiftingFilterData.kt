package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LiftingFilterData
 *
 * Full name:        System`LiftingFilterData
 *
 * Usage:            LiftingFilterData[…] represents lifting-filter data used to compute forward and inverse lifting wavelet transforms.
 *
 * Options:          Compiled -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LiftingFilterData
 * Documentation:    web: http://reference.wolfram.com/language/ref/LiftingFilterData.html
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
fun liftingFilterData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LiftingFilterData", arguments.toMutableList(), options)
}
