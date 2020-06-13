package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CloudDeploy
 *
 * Full name:        System`CloudDeploy
 *
 *                   CloudDeploy[expr] deploys expr to a new anonymous cloud object.
 *                   CloudDeploy[expr, location] deploys expr to a cloud object at the specified location relative to the user's cloud root directory.
 * Usage:            CloudDeploy[expr, CloudObject[…]] deploys expr to the specified cloud object.
 *
 *                   AppearanceElements -> All
 *                   AutoCopy -> False
 *                   CloudBase -> Automatic
 *                   CloudObjectNameFormat -> Automatic
 *                   CloudObjectURLType -> Automatic
 *                   IconRules -> Automatic
 *                   IncludeDefinitions -> True
 *                   MetaInformation -> {}
 *                   Permissions -> Automatic
 * Options:          SourceLink -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudDeploy
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudDeploy.html
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
fun cloudDeploy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudDeploy", arguments.toMutableList(), options)
}
