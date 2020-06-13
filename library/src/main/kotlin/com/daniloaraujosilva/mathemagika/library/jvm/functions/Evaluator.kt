package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Evaluator
 *
 * Full name:        System`Evaluator
 *
 * Usage:            Evaluator is an option for objects such as Button, Dynamic, and Cell that gives the name of the kernel to use to evaluate their contents.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Evaluator
 * Documentation:    web: http://reference.wolfram.com/language/ref/Evaluator.html
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
fun evaluator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Evaluator", arguments.toMutableList(), options)
}
