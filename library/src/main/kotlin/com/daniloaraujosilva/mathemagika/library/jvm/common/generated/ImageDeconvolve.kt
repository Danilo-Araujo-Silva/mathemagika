package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageDeconvolve
 * 
 * Full name:        System`ImageDeconvolve
 * 
 * Usage:            ImageDeconvolve[image, ker] gives a deconvolution of image using kernel ker.
 * 
 *                   MaxIterations -> 10
 *                   Method -> DampedLS
 * Options:          Padding -> Reversed
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImageDeconvolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageDeconvolve.html
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
fun imageDeconvolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageDeconvolve", arguments.toMutableList(), options)
}
