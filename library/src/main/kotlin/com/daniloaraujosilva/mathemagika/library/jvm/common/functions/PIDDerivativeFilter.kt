package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PIDDerivativeFilter
 *
 * Full name:        System`PIDDerivativeFilter
 *
 * Usage:            PIDDerivativeFilter is an option to PIDTune that controls the filtering used for derivative terms.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PIDDerivativeFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/PIDDerivativeFilter.html
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
fun pIDDerivativeFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PIDDerivativeFilter", arguments.toMutableList(), options)
}
