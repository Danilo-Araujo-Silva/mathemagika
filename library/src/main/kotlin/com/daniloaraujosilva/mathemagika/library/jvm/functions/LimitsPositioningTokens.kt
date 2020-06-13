package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LimitsPositioningTokens
 *
 * Full name:        System`LimitsPositioningTokens
 *
 * Usage:            LimitsPositioningTokens is an option for selections that specifies a set of characters for which the option LimitsPositioning is set to True by default.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LimitsPositioningTokens
 * Documentation:    web: http://reference.wolfram.com/language/ref/LimitsPositioningTokens.html
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
fun limitsPositioningTokens(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LimitsPositioningTokens", arguments.toMutableList(), options)
}
