package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FeatureExtractor
 *
 * Full name:        System`FeatureExtractor
 *
 * Usage:            FeatureExtractor is an option for functions such as Classify that specifies how features should be extracted.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FeatureExtractor
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeatureExtractor.html
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
fun featureExtractor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeatureExtractor", arguments.toMutableList(), options)
}
