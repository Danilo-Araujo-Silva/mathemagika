package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GenerateDerivedKey
 * 
 * Full name:        System`GenerateDerivedKey
 * 
 *                   GenerateDerivedKey[password] generates a DerivedKey object from the password given.
 * Usage:            GenerateDerivedKey[password, salt] generates a DerivedKey object from the password and salt given.
 * 
 * Options:          Method -> <|Function -> scrypt, Parameters -> <|KeySize -> 64, N -> 32768, r -> 8, p -> 1|>|>
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GenerateDerivedKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateDerivedKey.html
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
fun generateDerivedKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateDerivedKey", arguments.toMutableList(), options)
}
