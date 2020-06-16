package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SphericalRegion
 *
 * Full name:        System`SphericalRegion
 *
 * Usage:            SphericalRegion is an option for three-dimensional graphics functions that specifies whether the final image should be scaled so that a sphere drawn around the three‐dimensional bounding box would fit in the display area specified.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SphericalRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/SphericalRegion.html
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
fun sphericalRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SphericalRegion", arguments.toMutableList(), options)
}
