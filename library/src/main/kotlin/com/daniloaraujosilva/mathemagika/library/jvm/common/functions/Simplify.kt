package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Simplify
 *
 * Full name:        System`Simplify
 *
 *                   Simplify[expr] performs a sequence of algebraic and other transformations on expr and returns the simplest form it finds.
 * Usage:            Simplify[expr, assum] does simplification using assumptions.
 *
 *                   Assumptions :> $Assumptions
 *                   ComplexityFunction -> Automatic
 *                   ExcludedForms -> {}
 *                   TimeConstraint -> 300
 *                   TransformationFunctions -> Automatic
 * Options:          Trig -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Simplify
 * Documentation:    web: http://reference.wolfram.com/language/ref/Simplify.html
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
fun simplify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Simplify", arguments.toMutableList(), options)
}
