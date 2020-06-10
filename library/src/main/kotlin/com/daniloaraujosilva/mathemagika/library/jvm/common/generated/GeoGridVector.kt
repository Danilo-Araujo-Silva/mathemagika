package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoGridVector
 * 
 * Full name:        System`GeoGridVector
 * 
 *                   GeoGridVector[loc  {v , v }, proj] represents a horizontal two-dimensional vector of components v , v  in the orthonormal frame of the coordinates of the geo projection proj, at geo location loc.
 *                                         x   y                                                                       x   y
 *                   GeoGridVector[loc  {v , v , v }, proj] represents a three-dimensional vector of horizontal components v , v  and vertical component v  at geo location loc.
 *                                         x   y   z                                                                         x   y                         z
 *                   GeoGridVector[{loc , loc , …}  {vec , vec , …}, proj] represents a collection of vectors vec  at respective geo locations loc .
 *                                     1     2           1     2                                                  i                                i
 *                   GeoGridVector[{loc   vec , loc   vec , …}, proj] represents the same collection of vectors.
 *                                     1      1     2      2
 * Usage:            GeoGridVector[vec, proj] represents a geo vector whose associated location has been implicitly specified.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoGridVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoGridVector.html
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
fun geoGridVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoGridVector", arguments.toMutableList(), options)
}
