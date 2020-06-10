package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SetPermissions
 * 
 * Full name:        System`SetPermissions
 * 
 *                   SetPermissions[obj, "pstring"] sets permissions for the cloud object obj to be as specified by the string pstring.
 *                   SetPermissions[obj, class  per] sets permissions for the specified class of users to be per.
 * Usage:            SetPermissions[pers] sets permissions as specified by pers for the cloud object corresponding to the current document.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SetPermissions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetPermissions.html
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
fun setPermissions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetPermissions", arguments.toMutableList(), options)
}
