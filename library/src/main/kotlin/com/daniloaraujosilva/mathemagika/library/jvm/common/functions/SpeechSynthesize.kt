package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpeechSynthesize
 *
 * Full name:        System`SpeechSynthesize
 *
 *                   SpeechSynthesize[expr] synthesizes the contents of expr as an Audio object.
 * Usage:            SpeechSynthesize[expr, voice] uses the specified voice to synthesize the speech signal.
 *
 *                   ArraySizeLimit -> Infinity
 *                   DetailedGraphics -> False
 *                   ExpressionDepthLimit -> Infinity
 *                   IncludeParentheses -> False
 *                   IntegerLimit -> Infinity
 *                   Language -> English
 *                   Method -> Automatic
 *                   OverwriteTarget -> False
 *                   RealPrecisionLimit -> 3
 * Options:          StringLengthLimit -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpeechSynthesize
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpeechSynthesize.html
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
fun speechSynthesize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpeechSynthesize", arguments.toMutableList(), options)
}
