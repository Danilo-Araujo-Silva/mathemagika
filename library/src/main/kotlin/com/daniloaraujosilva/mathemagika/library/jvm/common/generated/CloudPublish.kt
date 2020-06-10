package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CloudPublish
 * 
 * Full name:        System`CloudPublish
 * 
 *                   CloudPublish[] makes a public copy in the cloud of the current document.
 *                   CloudPublish[obj] makes a public copy of the cloud object obj.
 *                   CloudPublish[expr] deploys an expression to the cloud and makes it public.
 *                   CloudPublish[content, location] publishes to the specified location relative to the user's cloud root directory. 
 * Usage:            CloudPublish[content, CloudObject[…]] publishes to the specified cloud object.
 * 
 *                   AppearanceElements -> All
 *                   AutoCopy -> True
 *                   CloudBase -> Automatic
 *                   CloudObjectNameFormat -> Automatic
 *                   CloudObjectURLType -> Automatic
 *                   IconRules -> Automatic
 *                   IncludeDefinitions -> True
 *                   MetaInformation -> {}
 *                   Permissions -> {All -> Automatic}
 * Options:          SourceLink -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CloudPublish
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudPublish.html
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
fun cloudPublish(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudPublish", arguments.toMutableList(), options)
}
