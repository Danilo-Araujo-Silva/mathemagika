package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCollage
 *
 * Full name:        System`ImageCollage
 *
 *                   ImageCollage[{image , image , …}] creates a collage of images image .
 *                                      1       2                                       i
 *                   ImageCollage[{w   image , w   image , …}] creates a collage of images image  based on their corresponding weights w .
 *                                  1        1   2        2                                       i                                       i
 *                   ImageCollage[ image   w , image   w , … ] also creates a collage of images image  based on their corresponding weights w .
 *                                       1    1       2    2                                             i                                       i
 *                   ImageCollage[{w , w , …}  {image , image , …}] also creates a collage of images image  based on their corresponding weights w .
 *                                  1   2             1       2                                            i                                       i
 *                   ImageCollage[{{image , w }, {image , w }, …}] also creates a collage of images image  based on their corresponding weights w .
 *                                       1   1         2   2                                             i                                       i
 *                   ImageCollage[…, fitting] uses the fitting method to create the collage.
 * Usage:            ImageCollage[…, fitting, size] creates a collage of the specified size.
 *
 *                   Background -> GrayLevel[0.2]
 *                   ImagePadding -> None
 *                   ImageSize -> Automatic
 *                   Method -> Automatic
 *                   Padding -> Automatic
 * Options:          Resampling -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCollage
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCollage.html
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
fun imageCollage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCollage", arguments.toMutableList(), options)
}
