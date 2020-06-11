package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AngerJ
 *
 * Full name:        System`AngerJ
 *
 *                   AngerJ[ν, z] gives the Anger function J (z).
 *                                                          v
 *                                                                        μ
 *                   AngerJ[ν, μ, z] gives the associated Anger function J (z).
 * Usage:                                                                 ν
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AngerJ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AngerJ.html
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
fun angerJ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AngerJ", arguments.toMutableList(), options)
}
