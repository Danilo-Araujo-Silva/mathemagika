package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Pruning
 * 
 * Full name:        System`Pruning
 * 
 *                   Pruning[image] removes the outermost branches of thin objects in image by setting their values to black.
 *                   Pruning[image, n] removes branches that are at most n pixels long.
 *                   Pruning[image, {n}] removes n pixels from each branch.
 * Usage:            Pruning[image, n, t] treats values above t as foreground.
 * 
 * Options:          Padding -> 0
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Pruning
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pruning.html
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
fun pruning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pruning", arguments.toMutableList(), options)
}
