package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NonlocalMeansFilter
 *
 * Full name:        System`NonlocalMeansFilter
 *
 *                   NonlocalMeansFilter[image, r] applies a nonlocal means filter to image by comparing a range r neighborhood to its nearby neighborhoods.
 *                   NonlocalMeansFilter[image, r, ns] assumes an additive noise power value ns for comparing neighborhoods.
 * Usage:            NonlocalMeansFilter[image, r, ns, w] compares neighborhoods in a range w window.
 *
 * Options:          Padding -> Fixed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NonlocalMeansFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonlocalMeansFilter.html
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
fun nonlocalMeansFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonlocalMeansFilter", arguments.toMutableList(), options)
}
