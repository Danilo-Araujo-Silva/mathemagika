package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LucasL
 *
 * Full name:        System`LucasL
 *
 *                   LucasL[n] gives the Lucas number L .
 *                                                     n
 *                   LucasL[n, x] gives the Lucas polynomial L (x).
 * Usage:                                                     n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LucasL
 * Documentation:    web: http://reference.wolfram.com/language/ref/LucasL.html
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
fun lucasL(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LucasL", arguments.toMutableList(), options)
}
