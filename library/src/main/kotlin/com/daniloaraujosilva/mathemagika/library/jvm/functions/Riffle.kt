package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Riffle
 *
 * Full name:        System`Riffle
 *
 *                   Riffle[{e , e , …}, x] gives {e , x, e , x, …}.
 *                            1   2                 1      2
 *                   Riffle[{e , e , …}, {x , x , …}] gives {e , x , e , x , …}.
 *                            1   2        1   2              1   1   2   2
 *                                                                     th
 *                   Riffle[list, x, n] yields a list in which every n   element is x.
 *                   Riffle[list, x, {i   , i   , n}] yields a list in which x appears if possible at positions i   , RowBox[{Cell[BoxData[i   ], InlineFormula, ExpressionUUID -> cb3cd8a3-e3f9-4d93-8579-ebd07b7df049], +, n}], i    + 2n, … , i   .
 * Usage:                              min   max                                                                 min                        min                                                                                    min            max
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Riffle
 * Documentation:    web: http://reference.wolfram.com/language/ref/Riffle.html
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
fun riffle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Riffle", arguments.toMutableList(), options)
}
