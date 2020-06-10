package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Query
 * 
 * Full name:        System`Query
 * 
 *                   Query[operator , operator , …] represents a query that can be applied to a Dataset object, in which the successive operator  are applied at successively deeper levels. 
 * Usage:                          1          2                                                                                                 i
 * 
 *                   FailureAction -> Abort
 *                   MissingBehavior -> Automatic
 * Options:          PartBehavior -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Query
 * Documentation:    web: http://reference.wolfram.com/language/ref/Query.html
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
fun query(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Query", arguments.toMutableList(), options)
}
