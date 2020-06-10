package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MorphologicalComponents
 * 
 * Full name:        System`MorphologicalComponents
 * 
 *                   MorphologicalComponents[image] gives an array in which each pixel of image is replaced by an integer index representing the connected foreground image component in which the pixel lies.
 * Usage:            MorphologicalComponents[image, t] treats values above t as foreground.
 * 
 *                   CornerNeighbors -> True
 *                   Padding -> 0
 * Options:          Method -> Connected
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MorphologicalComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/MorphologicalComponents.html
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
fun morphologicalComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MorphologicalComponents", arguments.toMutableList(), options)
}
