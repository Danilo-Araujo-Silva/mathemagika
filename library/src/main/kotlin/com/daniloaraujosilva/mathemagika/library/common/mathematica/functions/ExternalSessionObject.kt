package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalSessionObject
 *
 * Full name:        System`ExternalSessionObject
 *
 * Usage:            ExternalSessionObject[…] represents an external session started by StartExternalSession for use with ExternalEvaluate.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalSessionObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalSessionObject.html
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
fun externalSessionObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalSessionObject", arguments.toMutableList(), options)
}
