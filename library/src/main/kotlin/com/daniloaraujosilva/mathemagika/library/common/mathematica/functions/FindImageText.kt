package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindImageText
 *
 * Full name:        System`FindImageText
 *
 *                   FindImageText[image] detects text in image and returns a single bounding box.
 *                   FindImageText[image, level] returns a list of bounding boxes at the specified structural level.
 * Usage:            FindImageText[image, level, prop] returns prop for text at the given level.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   MaxFeatures -> Automatic
 *                   MaxOverlapFraction -> Automatic
 *                   Method -> Automatic
 * Options:          PaddingSize -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindImageText
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindImageText.html
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
fun findImageText(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindImageText", arguments.toMutableList(), options)
}
