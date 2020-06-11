package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoDisk
 *
 * Full name:        System`GeoDisk
 *
 *                   GeoDisk[loc, r]  is a two-dimensional GeoGraphics primitive that represents a filled disk of radius r centered at the location loc on the surface of the Earth.
 *                   GeoDisk[loc, r, {α , α }] gives a sector of a disk from bearing α  to bearing α .
 * Usage:                              1   2                                          1             2
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoDisk
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoDisk.html
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
fun geoDisk(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoDisk", arguments.toMutableList(), options)
}
