package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KleinInvariantJ
 *
 * Full name:        System`KleinInvariantJ
 *
 * Usage:            KleinInvariantJ[τ] gives the Klein invariant modular elliptic function J(τ).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KleinInvariantJ
 * Documentation:    web: http://reference.wolfram.com/language/ref/KleinInvariantJ.html
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
fun kleinInvariantJ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KleinInvariantJ", arguments.toMutableList(), options)
}
