package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageFileScan
 *
 * Full name:        System`ImageFileScan
 *
 * Usage:            ImageFileScan[f, inputfile] applies the function f to the list of channel values for each pixel of the image stored in inputfile.
 *
 *                   Interleaving -> True
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageFileScan
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageFileScan.html
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
fun imageFileScan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageFileScan", arguments.toMutableList(), options)
}
