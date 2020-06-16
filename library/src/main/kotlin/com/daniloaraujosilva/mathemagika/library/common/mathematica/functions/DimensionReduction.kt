package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DimensionReduction
 *
 * Full name:        System`DimensionReduction
 *
 *                   DimensionReduction[{example , example , …}] generates a DimensionReducerFunction[…] that projects from the space defined by the example  to a lower-dimensional approximating manifold.
 *                                              1         2                                                                                                 i
 *                   DimensionReduction[examples, n] generates a DimensionReducerFunction[…] for an n-dimensional approximating manifold.
 * Usage:            DimensionReduction[examples, n, props] generates the specified properties of the dimensionality reduction.
 *
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> False
 *                   RandomSeeding -> 1234
 *                   RecordLog -> True
 *                   TargetDevice -> CPU
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DimensionReduction
 * Documentation:    web: http://reference.wolfram.com/language/ref/DimensionReduction.html
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
fun dimensionReduction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DimensionReduction", arguments.toMutableList(), options)
}
