package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageScan
 *
 * Full name:        System`ImageScan
 *
 * Usage:            ImageScan[f, image] evaluates f applied to each pixel of image in turn.
 *
 *                   Interleaving -> True
 * Options:          Masking -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageScan
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageScan.html
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
fun imageScan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageScan", arguments.toMutableList(), options)
}
