package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FourierDCTFilter
 *
 * Full name:        System`FourierDCTFilter
 *
 * Usage:            FourierDCTFilter[image, t] reduces noise in image by locally thresholding the discrete cosine transforms of overlapping subimages, using the hard threshold t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierDCTFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierDCTFilter.html
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
fun fourierDCTFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierDCTFilter", arguments.toMutableList(), options)
}
