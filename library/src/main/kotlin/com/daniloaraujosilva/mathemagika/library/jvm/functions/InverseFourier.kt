package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseFourier
 *
 * Full name:        System`InverseFourier
 *
 *                   InverseFourier[list] finds the discrete inverse Fourier transform of a list of complex numbers.
 *                   InverseFourier[list, {p , p , …}] returns the specified positions of the discrete inverse Fourier transform.
 * Usage:                                   1   2
 *
 * Options:          FourierParameters -> {0, 1}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InverseFourier
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseFourier.html
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
fun inverseFourier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseFourier", arguments.toMutableList(), options)
}
