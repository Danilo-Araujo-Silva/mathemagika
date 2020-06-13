package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FillingTransform
 *
 * Full name:        System`FillingTransform
 *
 *                   FillingTransform[image] gives a version of image with all extended minima filled.
 *                   FillingTransform[image, marker] fills extended minima in regions where at least one corresponding element of marker is nonzero.
 * Usage:            FillingTransform[image, h] fills only extended minima of depth h or less.
 *
 *                   CornerNeighbors -> True
 * Options:          Padding -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FillingTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/FillingTransform.html
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
fun fillingTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FillingTransform", arguments.toMutableList(), options)
}
