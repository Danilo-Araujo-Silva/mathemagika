package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HankelH2
 *
 * Full name:        System`HankelH2
 *
 *                                                                                (2)
 *                   HankelH2[n, z] gives the Hankel function of the second kind H   (z).
 * Usage:                                                                         n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HankelH2
 * Documentation:    web: http://reference.wolfram.com/language/ref/HankelH2.html
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
fun hankelH2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HankelH2", arguments.toMutableList(), options)
}
