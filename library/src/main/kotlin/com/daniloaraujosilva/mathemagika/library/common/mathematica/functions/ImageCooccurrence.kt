package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCooccurrence
 *
 * Full name:        System`ImageCooccurrence
 *
 *                   ImageCooccurrence[image, n] gives the n×n co-occurrence matrix for image.
 * Usage:            ImageCooccurrence[image, n, ker] computes a co-occurrence matrix for arbitrary spatial relationships specified by a kernel ker.
 *
 * Options:          Masking -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCooccurrence
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCooccurrence.html
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
fun imageCooccurrence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCooccurrence", arguments.toMutableList(), options)
}
