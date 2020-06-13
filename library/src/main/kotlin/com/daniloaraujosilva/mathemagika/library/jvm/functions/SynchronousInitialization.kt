package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SynchronousInitialization
 *
 * Full name:        System`SynchronousInitialization
 *
 * Usage:            SynchronousInitialization is an option for Manipulate, DynamicModule, and related functions that specifies whether or not to evaluate the expression given as the setting for Initialization synchronously.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SynchronousInitialization
 * Documentation:    web: http://reference.wolfram.com/language/ref/SynchronousInitialization.html
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
fun synchronousInitialization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SynchronousInitialization", arguments.toMutableList(), options)
}
