package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BinLists
 *
 * Full name:        System`BinLists
 *
 *                   BinLists[{x , x , …}] gives lists of the elements x  whose values lie in successive integer bins.
 *                              1   2                                   i
 *                   BinLists[{x , x , …}, dx] gives lists of the elements x  whose values lie in successive bins of width dx.
 *                              1   2                                       i
 *                   BinLists[{x , x , …}, {x   , x   , dx}] gives lists of the x  that lie in successive bins of width dx from x    to x   .
 *                              1   2        min   max                           i                                               min     max
 *                   BinLists[{x , x , …}, {{b , b , …}}] gives lists of the x  that lie in the intervals [b , b ), [b , b ), ….
 *                              1   2         1   2                           i                             1   2     2   3
 *                   BinLists[{{x , y , …}, {x , y , …}, …}, xbins, ybins, …] gives an array of lists where the first index corresponds to x bins, the second to y, and so on.
 * Usage:                        1   1        2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BinLists
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinLists.html
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
fun binLists(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinLists", arguments.toMutableList(), options)
}
