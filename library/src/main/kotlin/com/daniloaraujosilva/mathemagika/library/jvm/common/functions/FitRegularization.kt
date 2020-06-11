package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FitRegularization
 *
 * Full name:        System`FitRegularization
 *
 * Usage:            FitRegularization is an option for Fit and FindFit that specifies a regularization for fitting a model.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FitRegularization
 * Documentation:    web: http://reference.wolfram.com/language/ref/FitRegularization.html
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
fun fitRegularization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FitRegularization", arguments.toMutableList(), options)
}
