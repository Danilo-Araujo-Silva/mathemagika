package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoVector
 * 
 * Full name:        System`GeoVector
 * 
 *                   GeoVector[loc  {m, α}] represents a horizontal two-dimensional vector of magnitude m and bearing α at geo location loc.
 *                   GeoVector[loc  {m, α, w}] represents a three-dimensional vector of horizontal modulus m, bearing α and vertical component w at geo location loc.
 *                   GeoVector[{loc , loc , …}  {vec , vec , …}] represents a collection of vectors vec  at respective geo locations loc .
 *                                 1     2           1     2                                            i                                i
 *                   GeoVector[{loc   vec , loc   vec , …}] represents the same collection of vectors.
 *                                 1      1     2      2
 * Usage:            GeoVector[vec] represents a geo vector whose associated location has been implicitly specified.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoVector.html
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
fun geoVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoVector", arguments.toMutableList(), options)
}
