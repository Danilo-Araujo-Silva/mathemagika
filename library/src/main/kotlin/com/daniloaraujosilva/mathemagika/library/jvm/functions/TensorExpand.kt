package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TensorExpand
 *
 * Full name:        System`TensorExpand
 *
 * Usage:            TensorExpand[texpr] expands out tensor-related products in the symbolic tensor expression texpr.
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TensorExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/TensorExpand.html
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
fun tensorExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TensorExpand", arguments.toMutableList(), options)
}
