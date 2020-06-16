package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatchLocalNames
 *
 * Full name:        System`MatchLocalNames
 *
 * Usage:            MatchLocalNames is an option for Trace and related functions that specifies whether symbols such as x should match symbols with local names of the form x$nnn.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MatchLocalNames
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatchLocalNames.html
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
fun matchLocalNames(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatchLocalNames", arguments.toMutableList(), options)
}
