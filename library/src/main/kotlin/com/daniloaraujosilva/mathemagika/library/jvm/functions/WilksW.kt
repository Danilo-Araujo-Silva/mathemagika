package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WilksW
 *
 * Full name:        System`WilksW
 *
 *                   WilksW[m , m ] gives Wilks's  for the matrices m  and m .
 * Usage:                    1   2                                    1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WilksW
 * Documentation:    web: http://reference.wolfram.com/language/ref/WilksW.html
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
fun wilksW(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WilksW", arguments.toMutableList(), options)
}
