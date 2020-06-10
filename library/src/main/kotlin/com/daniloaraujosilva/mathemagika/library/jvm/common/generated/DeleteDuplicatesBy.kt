package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DeleteDuplicatesBy
 * 
 * Full name:        System`DeleteDuplicatesBy
 * 
 *                   DeleteDuplicatesBy[{e , e , …}, f] deletes those e  that yield duplicates in the list {f[e ], f[e ], …}.
 *                                        1   2                        i                                       1      2
 * Usage:            DeleteDuplicatesBy[f] represents an operator form of DeleteDuplicatesBy that can be applied to an expression.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DeleteDuplicatesBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteDuplicatesBy.html
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
fun deleteDuplicatesBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteDuplicatesBy", arguments.toMutableList(), options)
}
