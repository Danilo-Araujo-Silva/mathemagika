package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Downsample
 *
 * Full name:        System`Downsample
 *
 *                                                                                                       th
 *                   Downsample[array, n] returns a downsampled version of the array by sampling every n   element.
 *                   Downsample[array, n, offset] starts sampling from the element at position offset.
 * Usage:            Downsample[image, …] downsamples an image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Downsample
 * Documentation:    web: http://reference.wolfram.com/language/ref/Downsample.html
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
fun downsample(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Downsample", arguments.toMutableList(), options)
}
