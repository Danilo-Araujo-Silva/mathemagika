package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageTake
 *
 * Full name:        System`ImageTake
 *
 *                   ImageTake[image, n] gives an image consisting of the first n rows of image.
 *                   ImageTake[image, -n] gives an image consisting of the last n rows of image.
 *                   ImageTake[image, {row , row }] gives rows row  through row .
 *                                        1     2                 1            2
 *                   ImageTake[image, {row , row }, {col , col }] gives the image that spans row  to row  and col  to col .
 *                                        1     2       1     2                                 1       2        1       2
 *                   ImageTake[image3d, {slice , slice }, {row , row }, {col , col }] gives the 3D image consisting of the specified slices, rows, and columns.
 * Usage:                                     1       2       1     2       1     2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageTake
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageTake.html
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
fun imageTake(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageTake", arguments.toMutableList(), options)
}
