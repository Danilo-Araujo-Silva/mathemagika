package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GenerateDigitalSignature
 *
 * Full name:        System`GenerateDigitalSignature
 *
 *                   GenerateDigitalSignature[expr, key] generates a digital signature for expr using the specified private key.
 * Usage:            GenerateDigitalSignature[key] represents an operator form of GenerateDigitalSignature that can be applied to expressions.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GenerateDigitalSignature
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateDigitalSignature.html
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
fun generateDigitalSignature(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateDigitalSignature", arguments.toMutableList(), options)
}
