package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpeakerMatchQ
 *
 * Full name:        System`SpeakerMatchQ
 *
 *                   SpeakerMatchQ[audio, ref] gives True if speaker features in audio match the one from reference ref and returns False otherwise.
 *                   SpeakerMatchQ[{audio , audio , …}, ref] gives a list of results for each of audio .
 *                                       1       2                                                    i
 * Usage:            SpeakerMatchQ[ref] represents an operator form of SpeakerMatchQ that can be applied to an audio object.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   Masking -> All
 *                   RecognitionPrior -> 0.5
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpeakerMatchQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpeakerMatchQ.html
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
fun speakerMatchQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpeakerMatchQ", arguments.toMutableList(), options)
}
