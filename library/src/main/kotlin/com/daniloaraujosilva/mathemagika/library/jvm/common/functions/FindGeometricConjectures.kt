package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindGeometricConjectures
 *
 * Full name:        System`FindGeometricConjectures
 *
 *                   FindGeometricConjectures[scene] finds conjectures that appear to hold for the GeometricScene object scene and adds these conjectures to the scene object.
 *                   FindGeometricConjectures[{scene , scene , …}] finds conjectures that appear to hold for all instances scene  of a geometric scene and returns a combined scene with the conjectures added.
 *                                                  1       2                                                                   i
 *                   FindGeometricConjectures[scenes, patt] adds only conjectures that match the pattern patt.
 * Usage:            FindGeometricConjectures[scenes, patt, n] adds only up to n conjectures.
 *
 * Options:          Method -> {RandomInstance, RandomSeeding -> 1234}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindGeometricConjectures
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindGeometricConjectures.html
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
fun findGeometricConjectures(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindGeometricConjectures", arguments.toMutableList(), options)
}
