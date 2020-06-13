package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CenterArray
 *
 * Full name:        System`CenterArray
 *
 *                   CenterArray[a, n] creates a list of length n with the elements of a at the center and 0s elsewhere.
 *                   CenterArray[a, {n , n , …}] creates an n  × n  × … array with the array a at the center and 0s elsewhere.
 *                                    1   2                  1    2
 *                   CenterArray[a, nspec, pad] uses pad instead of 0 for the background.
 * Usage:            CenterArray[nspec] creates an array with a single 1 at the center and 0s elsewhere.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CenterArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/CenterArray.html
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
fun centerArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CenterArray", arguments.toMutableList(), options)
}
