package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FeatureTypes
 *
 * Full name:        System`FeatureTypes
 *
 * Usage:            FeatureTypes is an option for machine learning functions such as Classify or Predict that specifies what feature types to assume for elements of input data given.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FeatureTypes
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeatureTypes.html
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
fun featureTypes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeatureTypes", arguments.toMutableList(), options)
}
