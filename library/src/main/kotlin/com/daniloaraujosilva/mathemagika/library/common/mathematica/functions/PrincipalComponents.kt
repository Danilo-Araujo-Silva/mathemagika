package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PrincipalComponents
 *
 * Full name:        System`PrincipalComponents
 *
 * Usage:            PrincipalComponents[matrix] transforms elements of matrix into unscaled principal components.
 *
 * Options:          Method -> Covariance
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrincipalComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrincipalComponents.html
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
fun principalComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrincipalComponents", arguments.toMutableList(), options)
}
