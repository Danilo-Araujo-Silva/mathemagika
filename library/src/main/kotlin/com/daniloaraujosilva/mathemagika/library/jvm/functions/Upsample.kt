package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Upsample
 *
 * Full name:        System`Upsample
 *
 *                   Upsample[array, n] returns an upsampled version of the array by inserting n - 1 zeros between array elements.
 *                   Upsample[array, n, offset] shifts array so that its first element moves to the position offset in the resulting array.
 *                   Upsample[array, n, offset, val] inserts n - 1 elements of value val between array elements.
 * Usage:            Upsample[image, …] upsamples an image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Upsample
 * Documentation:    web: http://reference.wolfram.com/language/ref/Upsample.html
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
fun upsample(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Upsample", arguments.toMutableList(), options)
}
