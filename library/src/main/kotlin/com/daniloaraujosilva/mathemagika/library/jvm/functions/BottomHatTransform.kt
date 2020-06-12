package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BottomHatTransform
 *
 * Full name:        System`BottomHatTransform
 *
 *                   BottomHatTransform[image, ker] gives the morphological bottom-hat transform of image with respect to structuring element ker.
 *                   BottomHatTransform[image, r] gives the bottom-hat transform with respect to a range-r square.
 * Usage:            BottomHatTransform[data, …] applies a bottom-hat transform to an array of data.
 *
 * Options:          None
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BottomHatTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/BottomHatTransform.html
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
fun bottomHatTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BottomHatTransform", arguments.toMutableList(), options)
}
