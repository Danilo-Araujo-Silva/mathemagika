package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ForceVersionInstall
 * 
 * Full name:        System`ForceVersionInstall
 * 
 * Usage:            ForceVersionInstall is an option to PacletInstall and PacletInstallSubmit that specifies whether an older version of a paclet is allowed to be installed if a newer version is already installed.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/ForceVersionInstall
 * Documentation:    web: http://reference.wolfram.com/language/ref/ForceVersionInstall.html
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
fun forceVersionInstall(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ForceVersionInstall", arguments.toMutableList(), options)
}
