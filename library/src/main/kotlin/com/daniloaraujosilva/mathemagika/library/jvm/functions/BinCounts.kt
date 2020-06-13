package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BinCounts
 *
 * Full name:        System`BinCounts
 *
 *                   BinCounts[{x , x , …}] counts the number of elements x  whose values lie in successive integer bins.
 *                               1   2                                     i
 *                   BinCounts[{x , x , …}, dx] counts the number of elements x  whose values lie in successive bins of width dx.
 *                               1   2                                         i
 *                   BinCounts[{x , x , …}, {x   , x   , dx}] counts the number of x  in successive bins of width dx from x    to x   .
 *                               1   2        min   max                             i                                      min     max
 *                   BinCounts[{x , x , …}, {{b , b , …}}] counts the number of x  in the intervals [b , b ), [b , b ), ….
 *                               1   2         1   2                             i                    1   2     2   3
 *                   BinCounts[{{x , y , …}, {x , y , …}, …}, xbins, ybins, …] gives an array of counts where the first index corresponds to x bins, the second to y, and so on.
 * Usage:                         1   1        2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BinCounts
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinCounts.html
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
fun binCounts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinCounts", arguments.toMutableList(), options)
}
