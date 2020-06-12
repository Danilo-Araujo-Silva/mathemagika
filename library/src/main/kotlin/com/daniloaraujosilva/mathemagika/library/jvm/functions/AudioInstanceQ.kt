package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioInstanceQ
 *
 * Full name:        System`AudioInstanceQ
 *
 *                   AudioInstanceQ[audio, obj] gives True if audio sounds to be an instance of the object obj, and gives False otherwise.
 * Usage:            AudioInstanceQ[audio, obj, cat] assumes that audio is the sound of something in the category cat.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   Masking -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   RecognitionPrior -> 0.5
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioInstanceQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioInstanceQ.html
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
fun audioInstanceQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioInstanceQ", arguments.toMutableList(), options)
}
