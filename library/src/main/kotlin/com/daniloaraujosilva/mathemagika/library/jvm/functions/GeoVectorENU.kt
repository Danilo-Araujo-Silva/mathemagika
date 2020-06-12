package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoVectorENU
 *
 * Full name:        System`GeoVectorENU
 *
 *                   GeoVectorENU[loc  {v , v }] represents a horizontal two-dimensional vector of components v  and v  in an orthonormal frame tangent to the Earth at geo location loc.
 *                                        e   n                                                                 e      n
 *                   GeoVectorENU[loc  {v , v , v }] represents a three-dimensional vector of horizontal components v  and v , and vertical component v  at geo location loc.
 *                                        e   n   u                                                                   e      n                          u
 *                   GeoVectorENU[{loc , loc , …}  {vec , vec , …}] represents a collection of vectors vec  at respective geo locations loc .
 *                                    1     2           1     2                                            i                                i
 *                   GeoVectorENU[{loc   vec , loc   vec , …}] represents the same collection of vectors.
 *                                    1      1     2      2
 * Usage:            GeoVectorENU[vec] represents a geo vector whose associated location has been implicitly specified.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoVectorENU
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoVectorENU.html
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
fun geoVectorENU(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoVectorENU", arguments.toMutableList(), options)
}
