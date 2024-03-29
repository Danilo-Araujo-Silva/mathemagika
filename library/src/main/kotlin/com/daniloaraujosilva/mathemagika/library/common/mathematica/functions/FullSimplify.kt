package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FullSimplify
 *
 * Full name:        System`FullSimplify
 *
 *                   FullSimplify[expr] tries a wide range of transformations on expr involving elementary and special functions and returns the simplest form it finds.
 * Usage:            FullSimplify[expr, assum] does simplification using assumptions.
 *
 *                   Assumptions :> $Assumptions
 *                   ComplexityFunction -> Automatic
 *                   ExcludedForms -> {}
 *                   TimeConstraint -> Infinity
 *                   TransformationFunctions -> Automatic
 * Options:          Trig -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FullSimplify
 * Documentation:    web: http://reference.wolfram.com/language/ref/FullSimplify.html
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
fun fullSimplify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FullSimplify", arguments.toMutableList(), options)
}
