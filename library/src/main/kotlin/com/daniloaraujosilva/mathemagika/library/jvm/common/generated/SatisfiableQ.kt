package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SatisfiableQ
 * 
 * Full name:        System`SatisfiableQ
 * 
 *                   SatisfiableQ[bf] gives True if a combination of values of variables exists that makes the Boolean function bf yield True.
 *                   SatisfiableQ[expr, {a , a , …}] gives True if a combination of values of the a  exists that makes the Boolean expression expr yield True.
 * Usage:                                 1   2                                                    i
 * 
 * Options:          Method -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SatisfiableQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SatisfiableQ.html
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
fun satisfiableQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SatisfiableQ", arguments.toMutableList(), options)
}
