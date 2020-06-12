package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FeatureNames
 *
 * Full name:        System`FeatureNames
 *
 * Usage:            FeatureNames is an option for machine learning functions such as Classify or Predict that specifies names to use for elements of input data given.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FeatureNames
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeatureNames.html
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
fun featureNames(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeatureNames", arguments.toMutableList(), options)
}
