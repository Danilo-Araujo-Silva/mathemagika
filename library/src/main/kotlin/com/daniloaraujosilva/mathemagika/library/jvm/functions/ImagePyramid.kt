package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePyramid
 *
 * Full name:        System`ImagePyramid
 *
 *                   ImagePyramid[image] creates a Gaussian image pyramid formed from image.
 *                   ImagePyramid[image, pyrtype] returns a Gaussian or Laplacian pyramid depending of the specified pyrtype.
 *                   ImagePyramid[image, pyrtype, n] returns up to n levels of the pyramid.
 *                   ImagePyramid[image, pyrtype, {size}] returns pyramid levels down to image dimensions given by size.
 * Usage:            ImagePyramid[image, pyrtype, n, s] returns a pyramid with successive levels downsampled by factor s.
 *
 * Options:          Padding -> Reversed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagePyramid
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePyramid.html
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
fun imagePyramid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePyramid", arguments.toMutableList(), options)
}
