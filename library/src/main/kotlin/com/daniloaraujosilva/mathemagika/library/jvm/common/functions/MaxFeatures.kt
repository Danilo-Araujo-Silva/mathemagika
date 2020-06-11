package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxFeatures
 *
 * Full name:        System`MaxFeatures
 *
 * Usage:            MaxFeatures is an option that specifies the maximum number of features that will be returned from feature detection algorithms.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MaxFeatures
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxFeatures.html
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
fun maxFeatures(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxFeatures", arguments.toMutableList(), options)
}
