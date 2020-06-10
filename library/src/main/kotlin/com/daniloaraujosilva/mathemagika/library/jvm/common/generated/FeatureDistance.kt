package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FeatureDistance
 * 
 * Full name:        System`FeatureDistance
 * 
 *                   FeatureDistance[example , example , extractor] gives the distance between example  and example  in the feature space defined by extractor.
 *                                          1         2                                               1            2
 * Usage:            FeatureDistance[extractor] represents an operator form of FeatureDistance that can be applied to a pair of examples.
 * 
 * Options:          DistanceFunction -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FeatureDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeatureDistance.html
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
fun featureDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeatureDistance", arguments.toMutableList(), options)
}
