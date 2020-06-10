package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TransformedProcess
 * 
 * Full name:        System`TransformedProcess
 * 
 *                   TransformedProcess[expr, x  proc, t] represents the transformed process of expr where the variable x follows the random process proc and t denotes the time.
 *                   TransformedProcess[expr, {x   proc , x   proc , …}, t] represents a transformed process where x , x , … are independent and follow the processes proc , proc , ….
 * Usage:                                       1       1   2       2                                                 1   2                                                 1      2
 * 
 * Options:          Assumptions :> $Assumptions
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TransformedProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransformedProcess.html
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
fun transformedProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransformedProcess", arguments.toMutableList(), options)
}
