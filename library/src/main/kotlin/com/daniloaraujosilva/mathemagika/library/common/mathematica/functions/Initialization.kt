package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Initialization
 *
 * Full name:        System`Initialization
 *
 * Usage:            Initialization is an option for notebooks, cells, Dynamic, DynamicModule, Manipulate and related constructs that specifies an expression to be evaluated when the construct is first displayed.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Initialization
 * Documentation:    web: http://reference.wolfram.com/language/ref/Initialization.html
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
fun initialization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Initialization", arguments.toMutableList(), options)
}
