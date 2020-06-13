package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageTrim
 *
 * Full name:        System`ImageTrim
 *
 *                   ImageTrim[image, roi] gives the smallest subimage of image that includes the specified region of interest roi.
 *                   ImageTrim[image, roi, r] adds a margin of size r back to the resulting image.
 *                   ImageTrim[image, {roi , roi , …}, …] extracts multiple subimages specified by roi  from image.
 * Usage:                                 1     2                                                     i
 *
 *                   DataRange -> Full
 * Options:          Padding -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageTrim
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageTrim.html
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
fun imageTrim(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageTrim", arguments.toMutableList(), options)
}
