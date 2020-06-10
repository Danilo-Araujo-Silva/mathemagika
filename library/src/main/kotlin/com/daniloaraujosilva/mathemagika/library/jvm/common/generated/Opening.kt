package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Opening
 * 
 * Full name:        System`Opening
 * 
 *                   Opening[image, ker] gives the morphological opening of image with respect to the structuring element ker.
 *                   Opening[image, r] gives the opening with respect to a range-r square.
 * Usage:            Opening[data, …] applies opening to an array of data.
 * 
 * Options:          None
 * 
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Opening
 * Documentation:    web: http://reference.wolfram.com/language/ref/Opening.html
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
fun opening(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Opening", arguments.toMutableList(), options)
}
