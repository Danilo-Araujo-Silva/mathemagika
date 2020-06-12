package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudExport
 *
 * Full name:        System`CloudExport
 *
 *                   CloudExport[expr, "format"] exports expr to a new anonymous cloud object in the specified format.
 *                   CloudExport[expr, "format", "uri"] exports to a cloud object at a given URI.
 * Usage:            CloudExport[expr, "format", CloudObject["uri"]] exports to a given cloud object.
 *
 *                   AppearanceElements -> All
 *                   CloudBase -> Automatic
 *                   CloudObjectNameFormat -> Automatic
 *                   CloudObjectURLType -> Automatic
 *                   IconRules -> Automatic
 *                   MetaInformation -> {}
 * Options:          Permissions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudExport
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudExport.html
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
fun cloudExport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudExport", arguments.toMutableList(), options)
}
