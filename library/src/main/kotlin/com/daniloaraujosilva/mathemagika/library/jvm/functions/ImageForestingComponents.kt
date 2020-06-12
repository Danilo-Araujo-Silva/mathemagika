package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageForestingComponents
 *
 * Full name:        System`ImageForestingComponents
 *
 *                   ImageForestingComponents[image] finds a segmentation of image, returning an integer matrix in which positive integers label different components.
 *                   ImageForestingComponents[image, marker] tries to find a segmentation into components that include pixels indicated by marker.
 * Usage:            ImageForestingComponents[image, marker, r] finds components that are connected at a pixel scale given by r.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageForestingComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageForestingComponents.html
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
fun imageForestingComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageForestingComponents", arguments.toMutableList(), options)
}
