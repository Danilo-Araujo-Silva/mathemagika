package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RegionEmbeddingDimension
 *
 * Full name:        System`RegionEmbeddingDimension
 *
 * Usage:            RegionEmbeddingDimension[reg] gives the dimension of the space in which the region reg is embedded.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionEmbeddingDimension
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionEmbeddingDimension.html
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
fun regionEmbeddingDimension(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionEmbeddingDimension", arguments.toMutableList(), options)
}
