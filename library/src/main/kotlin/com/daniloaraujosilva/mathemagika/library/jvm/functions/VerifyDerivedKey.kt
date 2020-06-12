package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VerifyDerivedKey
 *
 * Full name:        System`VerifyDerivedKey
 *
 * Usage:            VerifyDerivedKey[key, password] verifies that password matches the password used to generate the derived key.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VerifyDerivedKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifyDerivedKey.html
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
fun verifyDerivedKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifyDerivedKey", arguments.toMutableList(), options)
}
