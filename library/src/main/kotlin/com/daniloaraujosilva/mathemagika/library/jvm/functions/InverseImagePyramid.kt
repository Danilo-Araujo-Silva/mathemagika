package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseImagePyramid
 *
 * Full name:        System`InverseImagePyramid
 *
 *                   InverseImagePyramid[pyr] reconstructs an image from an ImagePyramid object pyr.
 *                   InverseImagePyramid[pyr, pyrtype] assumes the specified pyramid type pyrtype.
 *                   InverseImagePyramid[pyr, pyrtype, n] reconstructs up to pyramid level n.
 * Usage:            InverseImagePyramid[pyr, pyrtype, {size}] reconstructs up to the smallest pyramid level larger than the specified size.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseImagePyramid
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseImagePyramid.html
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
fun inverseImagePyramid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseImagePyramid", arguments.toMutableList(), options)
}
