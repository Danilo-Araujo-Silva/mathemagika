package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Complement
 *
 * Full name:        System`Complement
 *
 *                   Complement[e   , e , e , …] gives the elements in e    that are not in any of the e .
 * Usage:                        all   1   2                            all                             i
 *
 * Options:          SameTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Complement
 * Documentation:    web: http://reference.wolfram.com/language/ref/Complement.html
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
fun complement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Complement", arguments.toMutableList(), options)
}
