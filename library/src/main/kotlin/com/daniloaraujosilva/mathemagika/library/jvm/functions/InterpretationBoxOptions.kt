package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InterpretationBoxOptions
 *
 * Full name:        System`InterpretationBoxOptions
 *
 * Usage:            InterpretationBoxOptions is an option for selections that specifies settings for InterpretationBox constructs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InterpretationBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/InterpretationBoxOptions.html
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
fun interpretationBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InterpretationBoxOptions", arguments.toMutableList(), options)
}
