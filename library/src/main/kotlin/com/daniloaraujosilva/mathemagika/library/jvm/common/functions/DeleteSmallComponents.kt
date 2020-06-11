package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteSmallComponents
 *
 * Full name:        System`DeleteSmallComponents
 *
 *                   DeleteSmallComponents[image] replaces small connected components in a binary image image with background pixels.
 *                   DeleteSmallComponents[m] replaces positive integers in a label matrix m with 0 if their tally is small.
 * Usage:            DeleteSmallComponents[…, n] replaces components consisting of n or fewer elements.
 *
 *                   CornerNeighbors -> True
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteSmallComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteSmallComponents.html
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
fun deleteSmallComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteSmallComponents", arguments.toMutableList(), options)
}
