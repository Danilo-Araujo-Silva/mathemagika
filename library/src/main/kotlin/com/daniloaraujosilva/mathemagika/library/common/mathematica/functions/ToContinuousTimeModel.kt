package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ToContinuousTimeModel
 *
 * Full name:        System`ToContinuousTimeModel
 *
 *                   ToContinuousTimeModel[lsys] gives the continuous-time approximation of the discrete-time systems models lsys.
 * Usage:            ToContinuousTimeModel[tfm, s] specifies the transform variable s.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToContinuousTimeModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToContinuousTimeModel.html
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
fun toContinuousTimeModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToContinuousTimeModel", arguments.toMutableList(), options)
}
