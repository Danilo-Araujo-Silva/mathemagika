package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DistanceMatrix
 *
 * Full name:        System`DistanceMatrix
 *
 *                   DistanceMatrix[{u , u , …}] gives the matrix of distances between each pair of elements u , u .
 *                                    1   2                                                                   i   j
 *                   DistanceMatrix[{u , u , …}, {v , v , …}] gives the matrix of distances between each pair of elements u , v .
 * Usage:                             1   2        1   2                                                                   i   j
 *
 *                   DistanceFunction -> Automatic
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   NumericalDistance -> False
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> False
 *                   RandomSeeding -> 1234
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DistanceMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistanceMatrix.html
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
fun distanceMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistanceMatrix", arguments.toMutableList(), options)
}
