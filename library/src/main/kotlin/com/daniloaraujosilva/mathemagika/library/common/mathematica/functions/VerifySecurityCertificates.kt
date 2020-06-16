package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VerifySecurityCertificates
 *
 * Full name:        System`VerifySecurityCertificates
 *
 * Usage:            VerifySecurityCertificates is an option for URLRead and related functions that specifies whether to verify security certificates when making an HTTPS connection.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/VerifySecurityCertificates
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifySecurityCertificates.html
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
fun verifySecurityCertificates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifySecurityCertificates", arguments.toMutableList(), options)
}
