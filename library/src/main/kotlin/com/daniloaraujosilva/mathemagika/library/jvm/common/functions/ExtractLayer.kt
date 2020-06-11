package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExtractLayer
 *
 * Full name:        System`ExtractLayer
 *
 * Usage:            ExtractLayer[] represents a net layer that takes an array and a position specification as inputs and extracts the specified parts from the array.
 *
 *                   Input -> Automatic
 *                   Output -> Automatic
 * Options:          Position -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExtractLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtractLayer.html
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
fun extractLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtractLayer", arguments.toMutableList(), options)
}
