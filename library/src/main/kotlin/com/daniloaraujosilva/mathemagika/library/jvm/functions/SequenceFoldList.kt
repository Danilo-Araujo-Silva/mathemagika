package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceFoldList
 *
 * Full name:        System`SequenceFoldList
 *
 *                   SequenceFoldList[f, {x , …, x }, {a , a , …}] gives {x , …, x , f[x , …, x , a ], f[x , …, x , f[x , …, x , a ], a ], …}.
 *                                         1      n     1   2              1      n     1      n   1      2      n     1      n   1    2
 *                   SequenceFoldList[f, {x , …, x }, {a , a , …}, k] applies f to k arguments at each step, with the first n coming from the x  or previous results, and the last k - n coming from the a .
 * Usage:                                  1      n     1   2                                                                                  i                                                          i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceFoldList
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceFoldList.html
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
fun sequenceFoldList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceFoldList", arguments.toMutableList(), options)
}
