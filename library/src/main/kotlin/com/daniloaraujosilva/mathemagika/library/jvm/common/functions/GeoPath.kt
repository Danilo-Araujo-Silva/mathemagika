package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoPath
 *
 * Full name:        System`GeoPath
 *
 *                   GeoPath[{loc , loc }, pathtype] is a GeoGraphics primitive that represents a path of type pathtype between locations loc  and loc .
 *                               1     2                                                                                                     1        2
 *                   GeoPath[{loc , loc , …}, pathtype] represents a path formed by joining paths of type pathtype between consecutive locations loc .
 *                               1     2                                                                                                            i
 *                   GeoPath[{loc , d, α}, pathtype] represents a path moving from location loc  a distance d with initial bearing α.
 *                               1                                                             1
 *                   GeoPath[{{loc  , loc  , …}, {loc  , …}, …}, pathtype] represents a disjoint collection of paths of type pathtype.
 * Usage:                         11     12          21
 *
 *                   CurveClosed -> False
 * Options:          VertexColors -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoPath.html
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
fun geoPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoPath", arguments.toMutableList(), options)
}
