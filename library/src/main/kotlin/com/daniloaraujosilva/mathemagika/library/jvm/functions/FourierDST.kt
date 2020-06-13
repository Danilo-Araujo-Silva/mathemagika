package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FourierDST
 *
 * Full name:        System`FourierDST
 *
 *                   FourierDST[list] finds the Fourier discrete sine transform of a list of real numbers.
 * Usage:            FourierDST[list, m] finds the Fourier discrete sine transform of type m.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FourierDST
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierDST.html
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
fun fourierDST(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierDST", arguments.toMutableList(), options)
}
