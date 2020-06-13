package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VerifyFileSignature
 *
 * Full name:        System`VerifyFileSignature
 *
 *                   VerifyFileSignature[{"file", sig}, key] verifies the digital signature sig for file using the specified public key.
 *                   VerifyFileSignature[{"file", range, sig}, key] verifies the digital signature sig for the specified range of bytes in the file.
 *                   VerifyFileSignature[{{file , range , sig }, {file , range , sig }, …}, key] verifies the digital signatures sig  for each of range  of bytes in the file , all using the specified public key.
 *                                             1       1     1        2       2     2                                               i                  i                     i
 * Usage:            VerifyFileSignature[key] represents an operator form of VerifyFileSignature that can be applied to files.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VerifyFileSignature
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifyFileSignature.html
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
fun verifyFileSignature(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifyFileSignature", arguments.toMutableList(), options)
}
