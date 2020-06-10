package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PacletInstallSubmit
 * 
 * Full name:        System`PacletInstallSubmit
 * 
 * Usage:            PacletInstallSubmit[paclet] asynchronously installs or updates paclet.
 * 
 *                   AllowVersionUpdate -> True
 *                   ForceVersionInstall -> False
 *                   KeepExistingVersion -> Automatic
 *                   PacletSite -> Automatic
 *                   UpdatePacletSites -> Automatic
 * Options:          CompletionFunction -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PacletInstallSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletInstallSubmit.html
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
fun pacletInstallSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletInstallSubmit", arguments.toMutableList(), options)
}
