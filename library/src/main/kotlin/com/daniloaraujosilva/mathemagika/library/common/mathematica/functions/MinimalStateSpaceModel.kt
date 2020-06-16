package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MinimalStateSpaceModel
 *
 * Full name:        System`MinimalStateSpaceModel
 *
 *                   MinimalStateSpaceModel[sys] gives the minimal state-space model of the state-space model sys.
 *                   MinimalStateSpaceModel[sys, {z , …}] specifies the new coordinates z .
 * Usage:                                          1                                     i
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinimalStateSpaceModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinimalStateSpaceModel.html
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
fun minimalStateSpaceModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinimalStateSpaceModel", arguments.toMutableList(), options)
}
