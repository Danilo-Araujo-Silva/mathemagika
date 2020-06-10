package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MangoldtLambda
 * 
 * Full name:        System`MangoldtLambda
 * 
 * Usage:            MangoldtLambda[n] gives the von Mangoldt function Λ(n).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MangoldtLambda
 * Documentation:    web: http://reference.wolfram.com/language/ref/MangoldtLambda.html
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
fun mangoldtLambda(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MangoldtLambda", arguments.toMutableList(), options)
}
