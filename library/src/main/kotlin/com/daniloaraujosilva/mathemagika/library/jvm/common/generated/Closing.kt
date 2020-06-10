package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Closing
 * 
 * Full name:        System`Closing
 * 
 *                   Closing[image, ker] gives the morphological closing of image with respect to the structuring element ker.
 *                   Closing[image, r] gives the closing with respect to a range-r square.
 * Usage:            Closing[data, …] applies closing to an array of data.
 * 
 * Options:          None
 * 
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Closing
 * Documentation:    web: http://reference.wolfram.com/language/ref/Closing.html
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
fun closing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Closing", arguments.toMutableList(), options)
}
