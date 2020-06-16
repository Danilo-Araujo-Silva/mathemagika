package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TakeList
 *
 * Full name:        System`TakeList
 *
 *                   TakeList[list, {n , n , …}] gives the list of results obtained by successively taking n  elements from list.
 *                                    1   2                                                                 i
 *                   TakeList[list, {seq , seq , …}] successively uses the sequence specifications seq .
 *                                      1     2                                                       i
 *                   TakeList[list, seqs , seqs , …] gives a nested list in which elements specified by the lists seqs  are taken at level i in list.
 * Usage:                               1      2                                                                      i
 *
 * Options:          None
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TakeList
 * Documentation:    web: http://reference.wolfram.com/language/ref/TakeList.html
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
fun takeList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TakeList", arguments.toMutableList(), options)
}
