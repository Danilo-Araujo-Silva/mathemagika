package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TopHatTransform
 * 
 * Full name:        System`TopHatTransform
 * 
 *                   TopHatTransform[image, ker] gives the morphological top-hat transform of image with respect to structuring element ker.
 *                   TopHatTransform[image, r] gives the top-hat transform with respect to a range-r square.
 * Usage:            TopHatTransform[data, …] applies top-hat transform to an array of data.
 * 
 * Options:          None
 * 
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TopHatTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/TopHatTransform.html
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
fun topHatTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TopHatTransform", arguments.toMutableList(), options)
}
