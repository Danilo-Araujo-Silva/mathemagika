package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FeatureNearest
 * 
 * Full name:        System`FeatureNearest
 * 
 *                   FeatureNearest[{elem , elem , …}, x] gives the list of elem  to which x is nearest in a computed feature space.
 *                                       1      2                               i
 *                   FeatureNearest[{elem   v , elem   v , …}, x] gives the v  corresponding to the elem  to which x is nearest.
 *                                       1    1      2    2                    i                          i
 *                   FeatureNearest[{elem , elem , …}  {v , v , …}, x] gives the same result.
 *                                       1      2         1   2
 *                   FeatureNearest[{elem , elem , …}  prop, x] gives the property prop for the elem  to which x is nearest.
 *                                       1      2                                                    i
 *                   FeatureNearest[data, {x , x , …}] effectively gives {FeatureNearest[data, x ], FeatureNearest[data, x ], …}.
 *                                          1   2                                               1                         2
 *                   FeatureNearest[data, x, n] gives the n nearest elem  to x.
 *                                                                      i
 * Usage:            FeatureNearest[data] generates a NearestFunction[…] that can be applied repeatedly to different x.
 * 
 *                   AllowExpressionFeatures -> False
 *                   DistanceFunction -> Automatic
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   ImputeMissing -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> False
 *                   RandomSeeding -> 1234
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FeatureNearest
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeatureNearest.html
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
fun featureNearest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeatureNearest", arguments.toMutableList(), options)
}
