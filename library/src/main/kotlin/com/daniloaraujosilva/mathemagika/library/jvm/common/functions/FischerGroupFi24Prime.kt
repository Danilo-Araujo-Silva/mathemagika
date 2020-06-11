package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FischerGroupFi24Prime
 *
 * Full name:        System`FischerGroupFi24Prime
 *
 *                                                                                          ′
 *                   FischerGroupFi24Prime[] represents the sporadic simple Fischer group Fi  .
 * Usage:                                                                                   24
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FischerGroupFi24Prime
 * Documentation:    web: http://reference.wolfram.com/language/ref/FischerGroupFi24Prime.html
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
fun fischerGroupFi24Prime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FischerGroupFi24Prime", arguments.toMutableList(), options)
}
