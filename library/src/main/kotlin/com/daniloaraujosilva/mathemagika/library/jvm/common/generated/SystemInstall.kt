package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemInstall
 * 
 * Full name:        System`SystemInstall
 * 
 * Usage:            SystemInstall[pack] downloads and installs the software package pack on your machine.
 * 
 *                   Interactive -> True
 * Options:          VerifySecurityCertificates -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SystemInstall
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemInstall.html
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
fun systemInstall(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemInstall", arguments.toMutableList(), options)
}
