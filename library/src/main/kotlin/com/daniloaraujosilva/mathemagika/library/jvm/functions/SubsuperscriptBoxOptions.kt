package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SubsuperscriptBoxOptions
 *
 * Full name:        System`SubsuperscriptBoxOptions
 *
 * Usage:            SubsuperscriptBoxOptions is an option for selections that specifies settings for SubsuperscriptBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SubsuperscriptBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsuperscriptBoxOptions.html
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
fun subsuperscriptBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsuperscriptBoxOptions", arguments.toMutableList(), options)
}
