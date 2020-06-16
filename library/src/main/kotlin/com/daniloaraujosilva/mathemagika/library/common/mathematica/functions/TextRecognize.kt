package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TextRecognize
 *
 * Full name:        System`TextRecognize
 *
 *                   TextRecognize[image] recognizes text in image and returns it as a string.
 *                   TextRecognize[image, level] returns a list of strings at the specified structural level.
 * Usage:            TextRecognize[image, level, prop] returns prop for text at the given level.
 *
 *                   Language :> $Language
 *                   Masking -> All
 * Options:          RecognitionPrior -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TextRecognize
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextRecognize.html
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
fun textRecognize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextRecognize", arguments.toMutableList(), options)
}
