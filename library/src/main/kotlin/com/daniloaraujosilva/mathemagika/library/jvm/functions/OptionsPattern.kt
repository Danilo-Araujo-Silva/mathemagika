package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OptionsPattern
 *
 * Full name:        System`OptionsPattern
 *
 *                   OptionsPattern[] is a pattern object that represents a collection of options given as rules, where the values of the options can be accessed using OptionValue.
 *                   OptionsPattern[f] takes default option values from Options[f].
 *                   OptionsPattern[{opt   val , opt   val , …}] uses an explicit list of default option values.
 * Usage:                               1      1     2      2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OptionsPattern
 * Documentation:    web: http://reference.wolfram.com/language/ref/OptionsPattern.html
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
fun optionsPattern(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OptionsPattern", arguments.toMutableList(), options)
}
