package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PacletInstall
 *
 * Full name:        System`PacletInstall
 *
 *                   PacletInstall[paclet] installs or updates paclet.
 *                   PacletInstall[task] waits for completion of the taskstarted by a call to PacletInstallSubmit.
 * Usage:
 *
 *                   AllowVersionUpdate -> True
 *                   ForceVersionInstall -> False
 *                   KeepExistingVersion -> Automatic
 *                   PacletSite -> Automatic
 *                   UpdatePacletSites -> Automatic
 *                   ShowProgress -> False
 *                   IgnoreVersion -> False
 *                   KeepExisting -> Automatic
 *                   Site -> Automatic
 * Options:          UpdateSites -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletInstall
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletInstall.html
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
fun pacletInstall(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletInstall", arguments.toMutableList(), options)
}
