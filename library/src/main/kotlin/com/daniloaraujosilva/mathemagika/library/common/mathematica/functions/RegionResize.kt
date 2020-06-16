package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RegionResize
 *
 * Full name:        System`RegionResize
 *
 *                   RegionResize[reg, l] resize the region reg to have the first side length l preserving side length ratios.
 *                   RegionResize[reg, {l   }] resize into a box with maximum side length l    preserving side length ratios.
 *                                       max                                               max
 *                   RegionResize[reg, {l , l , …}] resize into a box with side lengths l .
 *                                       1   2                                           i
 *                   RegionResize[reg, {{x      , x      }, {x      , x      }, …}] resize into a box with corners {x      , x      , …} and {x      , x      , …}.
 * Usage:                                 1, min   1, max     2, min   2, max                                        1, min   2, min           1, max   2, max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionResize
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionResize.html
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
fun regionResize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionResize", arguments.toMutableList(), options)
}
