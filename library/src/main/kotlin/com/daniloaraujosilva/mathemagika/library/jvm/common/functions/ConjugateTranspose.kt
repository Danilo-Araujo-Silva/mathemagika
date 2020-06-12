package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConjugateTranspose
 *
 * Full name:        System`ConjugateTranspose
 *
 *                                             
 * Usage:            ConjugateTranspose[m] or m  gives the conjugate transpose of m.
 *
 * Options:          AllowedHeads -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConjugateTranspose
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConjugateTranspose.html
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
fun conjugateTranspose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConjugateTranspose", arguments.toMutableList(), options)
}