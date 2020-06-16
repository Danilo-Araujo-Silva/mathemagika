package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CreateCloudExpression
 *
 * Full name:        System`CreateCloudExpression
 *
 *                   CreateCloudExpression[value] creates a new anonymous cloud expression that stores the specified initial value.
 * Usage:            CreateCloudExpression[value, "name"] creates a new cloud expression with the specified name.
 *
 *                   PartProtection -> Automatic
 * Options:          Permissions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateCloudExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateCloudExpression.html
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
fun createCloudExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateCloudExpression", arguments.toMutableList(), options)
}
