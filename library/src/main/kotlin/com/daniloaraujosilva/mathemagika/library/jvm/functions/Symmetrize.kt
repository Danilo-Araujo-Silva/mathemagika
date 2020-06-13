package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Symmetrize
 *
 * Full name:        System`Symmetrize
 *
 * Usage:            Symmetrize[tensor, sym] returns the symmetrization of tensor under the symmetry sym.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Symmetrize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Symmetrize.html
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
fun symmetrize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Symmetrize", arguments.toMutableList(), options)
}
