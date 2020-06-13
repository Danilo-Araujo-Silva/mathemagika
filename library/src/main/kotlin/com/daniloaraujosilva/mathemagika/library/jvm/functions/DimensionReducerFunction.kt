package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DimensionReducerFunction
 *
 * Full name:        System`DimensionReducerFunction
 *
 * Usage:            DimensionReducerFunction[…] represents a function generated by DimensionReduction that projects data onto a lower-dimensional approximating manifold.
 *
 *                   BatchProcessing -> Automatic
 *                   PerformanceGoal -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DimensionReducerFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/DimensionReducerFunction.html
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
fun dimensionReducerFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DimensionReducerFunction", arguments.toMutableList(), options)
}
