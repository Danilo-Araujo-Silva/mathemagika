package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PatternSequence
 *
 * Full name:        System`PatternSequence
 *
 *                   PatternSequence[p , p , …] is a pattern object that represents a sequence of arguments matching p , p , ….
 * Usage:                             1   2                                                                           1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PatternSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/PatternSequence.html
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
fun patternSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PatternSequence", arguments.toMutableList(), options)
}
