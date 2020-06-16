package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ToDiscreteTimeModel
 *
 * Full name:        System`ToDiscreteTimeModel
 *
 *                   ToDiscreteTimeModel[lsys, τ] gives the discrete-time approximation, with sampling period τ, of the continuous-time systems models lsys.
 * Usage:            ToDiscreteTimeModel[tfm, τ, z] specifies the transform variable z.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToDiscreteTimeModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToDiscreteTimeModel.html
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
fun toDiscreteTimeModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToDiscreteTimeModel", arguments.toMutableList(), options)
}
