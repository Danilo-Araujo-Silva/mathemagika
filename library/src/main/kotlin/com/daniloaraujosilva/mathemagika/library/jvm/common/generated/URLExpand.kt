package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             URLExpand
 * 
 * Full name:        System`URLExpand
 * 
 * Usage:            URLExpand["url"] expands a shortened "url".
 * 
 *                   VerifySecurityCertificates -> True
 *                   CookieFunction -> Automatic
 *                   TimeConstraint -> None
 * Options:          Interactive -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/URLExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLExpand.html
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
fun uRLExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLExpand", arguments.toMutableList(), options)
}
