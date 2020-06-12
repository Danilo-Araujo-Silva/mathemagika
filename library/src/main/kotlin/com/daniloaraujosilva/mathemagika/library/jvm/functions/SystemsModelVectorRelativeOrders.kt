package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelVectorRelativeOrders
 *
 * Full name:        System`SystemsModelVectorRelativeOrders
 *
 * Usage:            SystemsModelVectorRelativeOrders[sys] gives the vector-relative orders of the systems model sys.
 *
 *                   MaxIterations -> Automatic
 * Options:          ZeroTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelVectorRelativeOrders
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelVectorRelativeOrders.html
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
fun systemsModelVectorRelativeOrders(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelVectorRelativeOrders", arguments.toMutableList(), options)
}
