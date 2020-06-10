package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PermissionsKeys
 * 
 * Full name:        System`PermissionsKeys
 * 
 * Usage:            PermissionsKeys[] gives a list of all valid permissions keys created by the currently authenticated user.
 * 
 * Options:          CloudBase -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PermissionsKeys
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermissionsKeys.html
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
fun permissionsKeys(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermissionsKeys", arguments.toMutableList(), options)
}
