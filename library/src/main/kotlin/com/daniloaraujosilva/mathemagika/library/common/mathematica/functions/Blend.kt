package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Blend
 *
 * Full name:        System`Blend
 *
 *                   Blend[{col , col }, x] gives a color obtained by blending a fraction 1 - x of color col  and x of color col .
 *                             1     2                                                                      1                   2
 *                   Blend[{col , col , col , …}, x] linearly interpolates between colors col  as x varies from 0 to 1.
 *                             1     2     3                                                 i
 *                   Blend[{{x , col }, {x , col }, …}, x] interpolates to give col  when x = x .
 *                            1     1     2     2                                  i           i
 *                   Blend[{col , col , …}, {u , u , …}] blends all the col , using fraction u  of color col .
 *                             1     2        1   2                        i                  i             i
 *                   Blend[{image , image , …}, …] blends pixel values of 2D or 3D images image .
 * Usage:                        1       2                                                     i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Blend
 * Documentation:    web: http://reference.wolfram.com/language/ref/Blend.html
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
fun blend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Blend", arguments.toMutableList(), options)
}
