package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CoordinateBounds
 *
 * Full name:        System`CoordinateBounds
 *
 *                   CoordinateBounds[coords] gives a list {{x   , x   }, {y   , y   }, …} of the bounds in each dimension of the region defined by coords.
 *                                                            min   max     min   max
 *                   CoordinateBounds[coords, δ] pads the ranges of coordinates by ± δ in each dimension.
 *                   CoordinateBounds[coords, Scaled[s]] pads by the scaled amount s in each dimension.
 *                   CoordinateBounds[coords, {p , p , …}] pads by p , p , … in successive dimensions.
 *                                              1   2               1   2
 *                   CoordinateBounds[coords, {{p    , p    }, {p    , p    }, …] gives {{x    - p    , x    + p    }, {y    - p    , y    + p    }, …}
 * Usage:                                        1min   1max     2min   2max               min    1min   max    1max     min    2min   max    2max
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CoordinateBounds
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinateBounds.html
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
fun coordinateBounds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinateBounds", arguments.toMutableList(), options)
}
