package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AnglePath3D
 *
 * Full name:        System`AnglePath3D
 *
 *                   AnglePath3D[{{α , β , γ }, {α , β , γ }, …}] gives the list of 3D coordinates of a path of an object that starts at {0, 0, 0}, then takes a series of steps of unit length, each in the direction of the x axis obtained after successive rotation of the object by the Euler angles α , β , γ .
 *                                  1   1   1     2   2   2                                                                                                                                                                                                                                                i   i   i
 *                   AnglePath3D[{{α , β }, {α , β }, …}] assumes the Euler angles γ  to be 0.
 *                                  1   1     2   2                                 i
 *                   AnglePath3D[{mat , mat , …}] takes the successive rotations to be specified by the 3D rotation matrices mat .
 *                                   1     2                                                                                    i
 *                   AnglePath3D[{{r , rot }, {r , rot }, …}] takes successive steps of length r  with Euler angles or rotation matrices specified by rot .
 *                                  1     1     2     2                                         i                                                        i
 *                   AnglePath3D[{x , y , z }, steps] starts at the point {x , y , z }.
 *                                 0   0   0                                0   0   0
 *                   AnglePath3D[{rot }, steps] starts in the x axis direction specified by rotating the object according to Euler angles or rotation matrix rot .
 *                                   0                                                                                                                          0
 *                   AnglePath3D[{{x , y , z }, rot }, steps] starts at point {x , y , z } with the x axis direction specified by rot .
 *                                  0   0   0      0                            0   0   0                                            0
 * Usage:            AnglePath3D[init, steps, form] returns at each step the data of the form specified by form.
 *
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnglePath3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnglePath3D.html
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
fun anglePath3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnglePath3D", arguments.toMutableList(), options)
}
