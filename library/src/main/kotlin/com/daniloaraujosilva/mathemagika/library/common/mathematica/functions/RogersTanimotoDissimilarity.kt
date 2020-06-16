package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RogersTanimotoDissimilarity
 *
 * Full name:        System`RogersTanimotoDissimilarity
 *
 * Usage:            RogersTanimotoDissimilarity[u, v] gives the Rogers–Tanimoto dissimilarity between Boolean vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RogersTanimotoDissimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/RogersTanimotoDissimilarity.html
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
fun rogersTanimotoDissimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RogersTanimotoDissimilarity", arguments.toMutableList(), options)
}
