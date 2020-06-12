package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioIdentify
 *
 * Full name:        System`AudioIdentify
 *
 *                   AudioIdentify[audio] yields the result of attempting to identify what audio is a recording of.
 *                   AudioIdentify[audio, category] restricts the identification to the specified category.
 *                   AudioIdentify[audio, category, n] gives a list of up to n possible identifications.
 * Usage:            AudioIdentify[audio, category, n, "prop"] gives the specified property for each identification.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   Masking -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   SpecificityGoal -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioIdentify
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioIdentify.html
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
fun audioIdentify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioIdentify", arguments.toMutableList(), options)
}
