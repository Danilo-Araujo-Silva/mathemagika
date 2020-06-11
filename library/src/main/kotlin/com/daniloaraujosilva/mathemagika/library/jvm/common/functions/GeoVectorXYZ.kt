package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoVectorXYZ
 *
 * Full name:        System`GeoVectorXYZ
 *
 *                   GeoVectorXYZ[loc  {v , v , v }] represents a three-dimensional vector of Cartesian components v , v , v  in an orthonormal frame parallel to the geocentric frame, at location loc.
 *                                        X   Y   Z                                                                  X   Y   Z
 *                   GeoVectorXYZ[{loc , loc , …}  {vec , vec , …}] represents a collection of vectors vec  at respective geo locations loc .
 *                                    1     2           1     2                                            i                                i
 *                   GeoVectorXYZ[{loc   vec , loc   vec , …}] represents the same collection of vectors.
 *                                    1      1     2      2
 * Usage:            GeoVectorXYZ[vec] represents a geo vector whose associated location has been implicitly specified.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoVectorXYZ
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoVectorXYZ.html
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
fun geoVectorXYZ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoVectorXYZ", arguments.toMutableList(), options)
}
