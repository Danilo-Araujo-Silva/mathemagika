package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LatticeReduce
 *
 * Full name:        System`LatticeReduce
 *
 *                   LatticeReduce[{v , v , …}] gives a reduced basis for the set of vectors v .
 * Usage:                            1   2                                                    i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LatticeReduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/LatticeReduce.html
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
fun latticeReduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LatticeReduce", arguments.toMutableList(), options)
}
