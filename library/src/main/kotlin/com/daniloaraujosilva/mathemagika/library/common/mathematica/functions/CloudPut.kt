package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CloudPut
 *
 * Full name:        System`CloudPut
 *
 *                   CloudPut[expr] writes expr to a new anonymous cloud object.
 *                   CloudPut[expr, "uri"] writes expr to a cloud object at a given URI.
 * Usage:            CloudPut[expr, CloudObject["uri"]] writes expr to a given cloud object.
 *
 *                   AppearanceElements -> All
 *                   CloudBase -> Automatic
 *                   CloudObjectNameFormat -> Automatic
 *                   CloudObjectURLType -> Automatic
 *                   IconRules -> Automatic
 *                   IncludeDefinitions -> False
 *                   MetaInformation -> {}
 * Options:          Permissions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudPut
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudPut.html
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
fun cloudPut(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudPut", arguments.toMutableList(), options)
}
