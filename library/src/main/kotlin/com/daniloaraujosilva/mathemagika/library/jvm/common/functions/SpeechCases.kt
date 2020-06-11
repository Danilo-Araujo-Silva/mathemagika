package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpeechCases
 *
 * Full name:        System`SpeechCases
 *
 *                   SpeechCases[audio, form] gives a list of cases of text identified as being of type form that appear in the transcription of audio.
 *                   SpeechCases[audio, {form , form , …}] gives an association of results for all the types form .
 *                                           1      2                                                            i
 *                   SpeechCases[audio, formspec  prop] gives the specified property for each result found.
 *                   SpeechCases[audio, formspec  {prop , prop , …}] gives a list of properties for each result found.
 *                                                      1      2
 * Usage:            SpeechCases[audio, spec, n] gives the first n cases found.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   Masking -> All
 *                   PerformanceGoal -> Automatic
 *                   TargetDevice -> CPU
 * Options:          VerifyInterpretation -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpeechCases
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpeechCases.html
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
fun speechCases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpeechCases", arguments.toMutableList(), options)
}
