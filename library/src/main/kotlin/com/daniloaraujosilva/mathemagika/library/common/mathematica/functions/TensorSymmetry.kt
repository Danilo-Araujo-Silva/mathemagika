package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TensorSymmetry
 *
 * Full name:        System`TensorSymmetry
 *
 *                   TensorSymmetry[tensor] gives the symmetry of tensor under permutations of its slots.
 * Usage:            TensorSymmetry[tensor, slots] gives the symmetry under permutation of the specified list of slots.
 *
 *                   Assumptions :> $Assumptions
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TensorSymmetry
 * Documentation:    web: http://reference.wolfram.com/language/ref/TensorSymmetry.html
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
fun tensorSymmetry(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TensorSymmetry", arguments.toMutableList(), options)
}
