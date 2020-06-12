package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePyramidApply
 *
 * Full name:        System`ImagePyramidApply
 *
 *                   ImagePyramidApply[f, pyr] applies f to all images in the ImagePyramid object pyr.
 *                   ImagePyramidApply[f, {pyr , pyr , …}] applies f to the sequence of corresponding levels taken from each pyr .
 * Usage:                                     1     2                                                                           i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagePyramidApply
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePyramidApply.html
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
fun imagePyramidApply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePyramidApply", arguments.toMutableList(), options)
}
