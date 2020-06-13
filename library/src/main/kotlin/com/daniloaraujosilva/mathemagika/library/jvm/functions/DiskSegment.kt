package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DiskSegment
 *
 * Full name:        System`DiskSegment
 *
 *                   DiskSegment[{x, y}, r, {θ , θ }] represents the disk segment from angle θ  to θ  in a disk centered at {x, y} of radius r.
 *                                            1   2                                           1     2
 *                   DiskSegment[{x, y}, {r , r }, {θ , θ }] represents the ellipse segment from angle θ  to θ  in an axis-aligned ellipse with semiaxes lengths r  and r .
 * Usage:                                  x   y     1   2                                              1     2                                                   x      y
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiskSegment
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiskSegment.html
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
fun diskSegment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiskSegment", arguments.toMutableList(), options)
}
