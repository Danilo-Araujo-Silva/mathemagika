package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Fourier
 *
 * Full name:        System`Fourier
 *
 *                   Fourier[list] finds the discrete Fourier transform of a list of complex numbers.
 *                   Fourier[list, {p , p , …}] returns the specified positions of the discrete Fourier transform.
 * Usage:                            1   2
 *
 * Options:          FourierParameters -> {0, 1}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Fourier
 * Documentation:    web: http://reference.wolfram.com/language/ref/Fourier.html
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
fun fourier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Fourier", arguments.toMutableList(), options)
}
