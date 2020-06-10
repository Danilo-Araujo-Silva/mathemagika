package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageResize
 * 
 * Full name:        System`ImageResize
 * 
 *                   ImageResize[image, width] gives a resized version of image that is width pixels wide.
 *                   ImageResize[image, {size}] gives a resized version of image with a maximum pixel width or height given by size.
 *                   ImageResize[image, {width, height}] gives a resized version of image that has exactly the specified pixel width and height.
 * Usage:            ImageResize[image, {width, depth, height}] gives a resized version of a 3D image with the specified dimensions.
 * 
 *                   Padding -> Reversed
 * Options:          Resampling -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ImageResize
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageResize.html
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
fun imageResize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageResize", arguments.toMutableList(), options)
}
