package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VerifyDigitalSignature
 * 
 * Full name:        System`VerifyDigitalSignature
 * 
 *                   VerifyDigitalSignature[{expr, sig}, key] verifies the digital signature sig for expr using the specified public key.
 *                   VerifyDigitalSignature[{{expr , sig }, {expr , sig }, …}, key] verifies the digital signatures sig  for each of the expr , all using the specified public key.
 *                                                1     1        2     2                                               i                     i
 * Usage:            VerifyDigitalSignature[key] is an operator form of VerifyDigitalSignature, suitable for application to {expr, sig} or a list of such pairs.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VerifyDigitalSignature
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifyDigitalSignature.html
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
fun verifyDigitalSignature(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifyDigitalSignature", arguments.toMutableList(), options)
}
