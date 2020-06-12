package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCrop
 *
 * Full name:        System`ImageCrop
 *
 *                   ImageCrop[image] crops image by removing borders of uniform color.
 *                   ImageCrop[image, size] crops image based on the size specification size.
 * Usage:            ImageCrop[image, size, spec] crops image by removing pixels from sides specified by spec.
 *
 * Options:          Padding -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCrop
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCrop.html
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
fun imageCrop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCrop", arguments.toMutableList(), options)
}
