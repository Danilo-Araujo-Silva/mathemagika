package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Deinitialization
 *
 * Full name:        System`Deinitialization
 *
 * Usage:            Deinitialization is an option for Dynamic, DynamicModule, Manipulate, and related constructs that specifies an expression to be evaluated when the construct can no longer be displayed or used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Deinitialization
 * Documentation:    web: http://reference.wolfram.com/language/ref/Deinitialization.html
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
fun deinitialization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Deinitialization", arguments.toMutableList(), options)
}
