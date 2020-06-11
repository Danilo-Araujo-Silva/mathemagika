package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Encrypt
 *
 * Full name:        System`Encrypt
 *
 *                   Encrypt["password", expr] encrypts expr using the specified password, to give an encrypted object.
 *                   Encrypt[keyspec, expr] encrypts expr using the cryptographic key specification keyspec.
 * Usage:            Encrypt[expr] interactively requests a password with which to encrypt expr.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Encrypt
 * Documentation:    web: http://reference.wolfram.com/language/ref/Encrypt.html
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
fun encrypt(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Encrypt", arguments.toMutableList(), options)
}
