package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FoldPair
 * 
 * Full name:        System`FoldPair
 * 
 *                   FoldPair[f, y , list] gives the last element of FoldPairList[f, y , list].
 *                                0                                                   0
 *                   FoldPair[f, y , list, g] gives the last element of FoldPairList[f, y , list, g].
 *                                0                                                      0
 *                   FoldPair[f, {a , a , a , …}] is equivalent to FoldPair[f, a , {a , a , …}].
 * Usage:                          0   1   2                                    0    1   2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FoldPair
 * Documentation:    web: http://reference.wolfram.com/language/ref/FoldPair.html
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
fun foldPair(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FoldPair", arguments.toMutableList(), options)
}
