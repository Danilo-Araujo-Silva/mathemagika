package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionSpace
 *
 * Full name:        System`FunctionSpace
 *
 * Usage:            FunctionSpace is an option for FindSequenceFunction and related functions that specifies the space of functions to consider for representations.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FunctionSpace
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionSpace.html
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
fun functionSpace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionSpace", arguments.toMutableList(), options)
}
