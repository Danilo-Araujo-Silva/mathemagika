package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PossibleZeroQ
 * 
 * Full name:        System`PossibleZeroQ
 * 
 * Usage:            PossibleZeroQ[expr] gives True if basic symbolic and numerical methods suggest that expr has value zero, and gives False otherwise. 
 * 
 *                   Assumptions :> $Assumptions
 * Options:          Method -> Automatic
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PossibleZeroQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PossibleZeroQ.html
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
fun possibleZeroQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PossibleZeroQ", arguments.toMutableList(), options)
}
