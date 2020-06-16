package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CloudAccountData
 *
 * Full name:        System`CloudAccountData
 *
 *                   CloudAccountData[] gives data associated with the cloud account currently being used.
 * Usage:            CloudAccountData["prop"] gives the property prop associated with the cloud account being used.
 *
 * Options:          CloudBase -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudAccountData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudAccountData.html
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
fun cloudAccountData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudAccountData", arguments.toMutableList(), options)
}
