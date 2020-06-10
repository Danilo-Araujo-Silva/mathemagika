package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ClearPermissions
 * 
 * Full name:        System`ClearPermissions
 * 
 *                   ClearPermissions[obj, class] clears permissions for the specified class of users for the cloud object obj. 
 * Usage:            ClearPermissions[class] clears permissions for the cloud object corresponding to the current document.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ClearPermissions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClearPermissions.html
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
fun clearPermissions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClearPermissions", arguments.toMutableList(), options)
}
