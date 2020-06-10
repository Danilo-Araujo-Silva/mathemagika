package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ReplacePixelValue
 * 
 * Full name:        System`ReplacePixelValue
 * 
 *                   ReplacePixelValue[image, ppos  val] changes the pixel values at pixel position ppos in image to val.
 * Usage:            ReplacePixelValue[image, ppos  val, "type"] assumes val to be of the specified type.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ReplacePixelValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplacePixelValue.html
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
fun replacePixelValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplacePixelValue", arguments.toMutableList(), options)
}
