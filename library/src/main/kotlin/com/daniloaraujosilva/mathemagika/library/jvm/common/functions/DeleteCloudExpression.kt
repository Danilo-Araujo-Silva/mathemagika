package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteCloudExpression
 *
 * Full name:        System`DeleteCloudExpression
 *
 *                   DeleteCloudExpression["name"] deletes the cloud expression identified by "name".
 * Usage:            DeleteCloudExpression[obj] deletes the cloud expression obj.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteCloudExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteCloudExpression.html
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
fun deleteCloudExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteCloudExpression", arguments.toMutableList(), options)
}
