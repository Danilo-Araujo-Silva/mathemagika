package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DualSystemsModel
 *
 * Full name:        System`DualSystemsModel
 *
 * Usage:            DualSystemsModel[ssm] gives the dual of the state-space model ssm.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DualSystemsModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/DualSystemsModel.html
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
fun dualSystemsModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DualSystemsModel", arguments.toMutableList(), options)
}
