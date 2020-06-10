package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MorphologicalPerimeter
 * 
 * Full name:        System`MorphologicalPerimeter
 * 
 *                   MorphologicalPerimeter[image] picks out the morphological perimeter of regions of foreground in image.
 * Usage:            MorphologicalPerimeter[image, t] treats values above t as foreground.
 * 
 *                   CornerNeighbors -> True
 * Options:          Padding -> 0
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MorphologicalPerimeter
 * Documentation:    web: http://reference.wolfram.com/language/ref/MorphologicalPerimeter.html
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
fun morphologicalPerimeter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MorphologicalPerimeter", arguments.toMutableList(), options)
}
