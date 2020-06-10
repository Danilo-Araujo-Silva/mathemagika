package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Once
 * 
 * Full name:        System`Once
 * 
 *                   Once[expr] evaluates expr once in each Wolfram Language session, always returning the result from the first evaluation.
 * Usage:            Once[expr, loc] evaluates expr once and caches the result in persistence location loc.
 * 
 *                   ExpirationDate -> None
 * Options:          PersistenceTime -> None
 * 
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Once
 * Documentation:    web: http://reference.wolfram.com/language/ref/Once.html
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
fun once(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Once", arguments.toMutableList(), options)
}
