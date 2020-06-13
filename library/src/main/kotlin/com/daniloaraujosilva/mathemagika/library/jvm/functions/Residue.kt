package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Residue
 *
 * Full name:        System`Residue
 *
 *                   Residue[expr, {z, z }] finds the residue of expr at the point z = z .
 * Usage:                               0                                               0
 *
 * Options:          Assumptions :> $Assumptions
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Residue
 * Documentation:    web: http://reference.wolfram.com/language/ref/Residue.html
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
fun residue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Residue", arguments.toMutableList(), options)
}
