package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Binarize
 *
 * Full name:        System`Binarize
 *
 *                   Binarize[image] creates a binary image from image by replacing all values above a globally determined threshold with 1 and others with 0.
 *                   Binarize[image, t] creates a binary image by replacing all values above t with 1 and others with 0.
 *                   Binarize[image, {t , t }] creates a binary image by replacing all values in the range t  through t  with 1 and others with 0.
 *                                     1   2                                                                1          2
 * Usage:            Binarize[image, f] creates a binary image by replacing all channel value lists for which f[v] yields True with 1 and others with 0.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Binarize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Binarize.html
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
fun binarize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Binarize", arguments.toMutableList(), options)
}
