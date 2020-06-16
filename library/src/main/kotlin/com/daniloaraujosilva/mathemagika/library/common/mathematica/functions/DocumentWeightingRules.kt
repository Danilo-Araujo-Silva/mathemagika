package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DocumentWeightingRules
 *
 * Full name:        System`DocumentWeightingRules
 *
 * Usage:            DocumentWeightingRules is an option for TextSearch and related functions that allows the specification of weights for documents based on the values of fields in the search index.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DocumentWeightingRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/DocumentWeightingRules.html
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
fun documentWeightingRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DocumentWeightingRules", arguments.toMutableList(), options)
}
