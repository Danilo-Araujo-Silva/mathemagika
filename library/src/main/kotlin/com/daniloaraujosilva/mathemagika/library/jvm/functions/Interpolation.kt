package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Interpolation
 *
 * Full name:        System`Interpolation
 *
 *                   Interpolation[{f , f , …}] constructs an interpolation of the function values f , assumed to correspond to x values 1, 2, … .
 *                                   1   2                                                          i
 *                   Interpolation[{{x , f }, {x , f }, …}] constructs an interpolation of the function values f  corresponding to x values x .
 *                                    1   1     2   2                                                           i                            i
 *                   Interpolation[{{{x , y , …}, f }, {{x , y , …}, f }, …}] constructs an interpolation of multidimensional data.
 *                                     1   1       1      2   2       2
 *                   Interpolation[{{{x , …}, f , df , …}, …}] constructs an interpolation that reproduces derivatives as well as function values.
 *                                     1       1    1
 * Usage:            Interpolation[data, x] find an interpolation of data at the point x.
 *
 *                   InterpolationOrder -> 3
 *                   Method -> Automatic
 * Options:          PeriodicInterpolation -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Interpolation
 * Documentation:    web: http://reference.wolfram.com/language/ref/Interpolation.html
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
fun interpolation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Interpolation", arguments.toMutableList(), options)
}
