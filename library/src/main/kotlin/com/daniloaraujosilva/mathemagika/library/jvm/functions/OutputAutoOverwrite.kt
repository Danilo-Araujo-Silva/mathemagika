package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OutputAutoOverwrite
 *
 * Full name:        System`OutputAutoOverwrite
 *
 * Usage:            OutputAutoOverwrite is an option for notebooks that specifies whether the output of a command should replace any existing output from a previous evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OutputAutoOverwrite
 * Documentation:    web: http://reference.wolfram.com/language/ref/OutputAutoOverwrite.html
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
fun outputAutoOverwrite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OutputAutoOverwrite", arguments.toMutableList(), options)
}
