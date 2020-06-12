package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dilation
 *
 * Full name:        System`Dilation
 *
 *                   Dilation[image, ker] gives the morphological dilation of image with respect to the structuring element ker.
 *                   Dilation[image, r] gives the dilation with respect to a range-r square.
 * Usage:            Dilation[data, …] applies dilation to an array of data.
 *
 * Options:          Padding -> Automatic
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Dilation
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dilation.html
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
fun dilation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dilation", arguments.toMutableList(), options)
}
