package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HankelH1
 *
 * Full name:        System`HankelH1
 *
 *                                                                               (1)
 *                   HankelH1[n, z] gives the Hankel function of the first kind H   (z).
 * Usage:                                                                        n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HankelH1
 * Documentation:    web: http://reference.wolfram.com/language/ref/HankelH1.html
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
fun hankelH1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HankelH1", arguments.toMutableList(), options)
}
