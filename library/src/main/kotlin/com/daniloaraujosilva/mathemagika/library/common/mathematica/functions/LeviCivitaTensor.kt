package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeviCivitaTensor
 *
 * Full name:        System`LeviCivitaTensor
 *
 * Usage:            LeviCivitaTensor[d] gives the d-dimensional Levi-Civita totally antisymmetric tensor.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LeviCivitaTensor
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeviCivitaTensor.html
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
fun leviCivitaTensor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeviCivitaTensor", arguments.toMutableList(), options)
}
