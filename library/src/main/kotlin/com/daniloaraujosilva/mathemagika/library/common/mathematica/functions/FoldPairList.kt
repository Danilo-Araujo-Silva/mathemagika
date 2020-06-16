package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FoldPairList
 *
 * Full name:        System`FoldPairList
 *
 *                   FoldPairList[f, y , {a , a , …}] gives the list of successive x  obtained by applying f to pairs of the form {y     , a }, where at each step f returns {x , y }.
 *                                    0    1   2                                    i                                               i - 1   i                                  i   i
 *                   FoldPairList[f, y , list, g] gives the list of successive values of g[{x , y }].
 *                                    0                                                      i   i
 *                   FoldPairList[f, {a , a , a , …}] is equivalent to FoldPairList[f, a , {a , a , …}].
 * Usage:                              0   1   2                                        0    1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FoldPairList
 * Documentation:    web: http://reference.wolfram.com/language/ref/FoldPairList.html
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
fun foldPairList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FoldPairList", arguments.toMutableList(), options)
}
