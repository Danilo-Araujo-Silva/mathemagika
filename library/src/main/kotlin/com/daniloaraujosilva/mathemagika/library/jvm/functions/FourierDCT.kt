package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FourierDCT
 *
 * Full name:        System`FourierDCT
 *
 *                   FourierDCT[list] finds the Fourier discrete cosine transform of a list of real numbers.
 * Usage:            FourierDCT[list, m] finds the Fourier discrete cosine transform of type m.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FourierDCT
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierDCT.html
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
fun fourierDCT(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierDCT", arguments.toMutableList(), options)
}
