package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EdgeDetect
 * 
 * Full name:        System`EdgeDetect
 * 
 *                   EdgeDetect[image] finds edges in image and returns the result as a binary image.
 *                   EdgeDetect[image, r] finds edges at the scale of the specified pixel range r.
 * Usage:            EdgeDetect[image, r, t] uses a threshold t for selecting image edges.
 * 
 *                   Method -> Automatic
 * Options:          Padding -> Fixed
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EdgeDetect
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeDetect.html
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
fun edgeDetect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeDetect", arguments.toMutableList(), options)
}
