package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JacobiAmplitude
 *
 * Full name:        System`JacobiAmplitude
 *
 * Usage:            JacobiAmplitude[u, m] gives the amplitude am(u  m) for Jacobi elliptic functions.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JacobiAmplitude
 * Documentation:    web: http://reference.wolfram.com/language/ref/JacobiAmplitude.html
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
fun jacobiAmplitude(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JacobiAmplitude", arguments.toMutableList(), options)
}
