package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudSave
 *
 * Full name:        System`CloudSave
 *
 *                   CloudSave[symbol] saves definitions associated with the specified symbol to a new anonymous cloud object.
 *                   CloudSave["form"] saves definitions associated with all symbols whose names match the string pattern "form".
 *                   CloudSave["context"] saves definitions associated with all symbols in the specified context.
 *                   CloudSave[{object , object , …}] saves definitions associated with several objects.
 *                                    1        2
 *                   CloudSave[symspec, "uri"] appends definitions associated with symspec to the cloud object at the given URI.
 * Usage:            CloudSave[symspec, CloudObject["uri"]] appends definitions to the given cloud object.
 *
 *                   AppearanceElements -> All
 *                   CloudBase -> Automatic
 *                   CloudObjectNameFormat -> Automatic
 *                   CloudObjectURLType -> Automatic
 *                   IconRules -> Automatic
 *                   MetaInformation -> {}
 * Options:          Permissions -> Automatic
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudSave
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudSave.html
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
fun cloudSave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudSave", arguments.toMutableList(), options)
}
