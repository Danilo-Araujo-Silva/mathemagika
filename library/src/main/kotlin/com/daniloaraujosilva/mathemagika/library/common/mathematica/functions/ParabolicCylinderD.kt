package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ParabolicCylinderD
 *
 * Full name:        System`ParabolicCylinderD
 *
 *                   ParabolicCylinderD[ν, z] gives the parabolic cylinder function D (z).
 * Usage:                                                                            ν
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ParabolicCylinderD
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParabolicCylinderD.html
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
fun parabolicCylinderD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParabolicCylinderD", arguments.toMutableList(), options)
}
