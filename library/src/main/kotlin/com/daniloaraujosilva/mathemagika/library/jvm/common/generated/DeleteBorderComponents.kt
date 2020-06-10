package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DeleteBorderComponents
 * 
 * Full name:        System`DeleteBorderComponents
 * 
 *                   DeleteBorderComponents[image] replaces connected components adjacent to the border in a binary image image with background pixels.
 * Usage:            DeleteBorderComponents[m] replaces components adjacent to the border in a label matrix m with 0.
 * 
 * Options:          CornerNeighbors -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DeleteBorderComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteBorderComponents.html
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
fun deleteBorderComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteBorderComponents", arguments.toMutableList(), options)
}
