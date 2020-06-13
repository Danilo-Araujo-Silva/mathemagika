package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeoNearest
 *
 * Full name:        System`GeoNearest
 *
 *                   GeoNearest[enttype, loc] returns the geographic entity of type enttype closest to the geo location loc.
 *                   GeoNearest[{reg , reg , …, reg }, loc] returns the nearest of the reg .
 *                                  1     2        n                                      i
 *                   GeoNearest[{reg   val , reg   val , …, reg   val }, loc] returns the val  corresponding to the nearest reg .
 *                                  1      1     2      2        n      n                       i                                 i
 *                   GeoNearest[{reg , reg , …, reg }  {val , val , …, val }, loc] returns the same result.
 *                                  1     2        n        1     2        n
 *                   GeoNearest[{reg , reg , …, reg }  Automatic, loc] takes the val  to be successive integers i.
 *                                  1     2        n                                 i
 *                   GeoNearest[spec, loc, n] returns n nearest values.
 * Usage:            GeoNearest[spec, loc, {n, r}] returns up to n matches within a radius r of loc.
 *
 *                   DistanceFunction -> Boundary
 *                   FullyContained -> False
 * Options:          TimeConstraint -> 20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoNearest
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoNearest.html
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
fun geoNearest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoNearest", arguments.toMutableList(), options)
}
