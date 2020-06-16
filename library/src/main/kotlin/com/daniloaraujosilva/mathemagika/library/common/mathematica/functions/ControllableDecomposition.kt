package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ControllableDecomposition
 *
 * Full name:        System`ControllableDecomposition
 *
 *                   ControllableDecomposition[sys] yields the controllable subsystem of the state-space model sys.
 *                   ControllableDecomposition[sys, {z , …}] specifies the new state variables z .
 * Usage:                                             1                                         i
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllableDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllableDecomposition.html
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
fun controllableDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllableDecomposition", arguments.toMutableList(), options)
}
