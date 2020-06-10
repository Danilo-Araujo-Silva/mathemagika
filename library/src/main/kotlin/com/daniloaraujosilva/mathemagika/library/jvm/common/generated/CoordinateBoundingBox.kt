package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CoordinateBoundingBox
 * 
 * Full name:        System`CoordinateBoundingBox
 * 
 *                   CoordinateBoundingBox[coords] gives the corners {{x   , y   , …}, {x   , y   , …}} of the bounding box of the region defined by coords.
 *                                                                      min   min        max   max
 *                   CoordinateBoundingBox[coords, δ] pads the region by δ in each direction.
 *                   CoordinateBoundingBox[coords, Scaled[s]] pads by the scaled amount s in each direction.
 *                   CoordinateBoundingBox[coords, {p , p , …}] pads by p , p , … in successive dimensions. 
 *                                                   1   2               1   2
 *                   CoordinateBoundingBox[coords, {{p    , p    }, {p    , p    }, …}] gives {{x    - p    , y    - p    , …}, {x    + p    , y    + p    , …}, …} 
 * Usage:                                             1min   1max     2min   2max                min    1min   min    2min        max    1max   max    2max
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CoordinateBoundingBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinateBoundingBox.html
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
fun coordinateBoundingBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinateBoundingBox", arguments.toMutableList(), options)
}
