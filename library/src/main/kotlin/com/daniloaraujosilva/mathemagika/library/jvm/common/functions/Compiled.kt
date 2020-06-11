package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Compiled
 *
 * Full name:        System`Compiled
 *
 * Usage:            Compiled is an option for various numerical and plotting functions which specifies whether the expressions they work with should automatically be compiled.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Compiled
 * Documentation:    web: http://reference.wolfram.com/language/ref/Compiled.html
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
fun compiled(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Compiled", arguments.toMutableList(), options)
}
