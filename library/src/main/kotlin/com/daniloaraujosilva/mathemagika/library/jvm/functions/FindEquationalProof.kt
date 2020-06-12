package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindEquationalProof
 *
 * Full name:        System`FindEquationalProof
 *
 *                   FindEquationalProof[thm, axms] tries to find an equational proof of the symbolic theorem thm using the axioms axms.
 * Usage:            FindEquationalProof[thm, "theory"] tries to find a proof of thm using the specified named axiomatic theory.
 *
 * Options:          TimeConstraint -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindEquationalProof
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindEquationalProof.html
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
fun findEquationalProof(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindEquationalProof", arguments.toMutableList(), options)
}
