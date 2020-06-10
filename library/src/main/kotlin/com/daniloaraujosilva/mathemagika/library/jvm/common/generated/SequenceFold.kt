package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SequenceFold
 * 
 * Full name:        System`SequenceFold
 * 
 *                   SequenceFold[f, {x , …, x }, {a , a , …}] gives the last element of SequenceFoldList[f, {x , …, x }, {a , a , …}].
 *                                     1      n     1   2                                                      1      n     1   2
 *                   SequenceFold[f, {x , …, x }, {a , a , …}, k] applies f to k arguments at each step, with the first n coming from the x  or previous results, and the last k - n coming from the a .
 * Usage:                              1      n     1   2                                                                                  i                                                          i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SequenceFold
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceFold.html
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
fun sequenceFold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceFold", arguments.toMutableList(), options)
}
