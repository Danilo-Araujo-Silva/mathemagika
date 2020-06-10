package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ReplaceImageValue
 * 
 * Full name:        System`ReplaceImageValue
 * 
 *                   ReplaceImageValue[image, pos  val] changes the pixel values at position pos in image to val.
 * Usage:            ReplaceImageValue[image, pos  val, "type"] assumes val to be of the specified type.
 * 
 * Options:          DataRange -> Full
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ReplaceImageValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplaceImageValue.html
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
fun replaceImageValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplaceImageValue", arguments.toMutableList(), options)
}
