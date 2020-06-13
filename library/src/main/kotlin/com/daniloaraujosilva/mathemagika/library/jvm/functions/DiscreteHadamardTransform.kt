package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteHadamardTransform
 *
 * Full name:        System`DiscreteHadamardTransform
 *
 * Usage:            DiscreteHadamardTransform[list] gives the discrete Hadamard transform of list.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteHadamardTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteHadamardTransform.html
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
fun discreteHadamardTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteHadamardTransform", arguments.toMutableList(), options)
}
