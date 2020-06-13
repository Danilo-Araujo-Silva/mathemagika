package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DeletePermissionsKey
 *
 * Full name:        System`DeletePermissionsKey
 *
 *                   DeletePermissionsKey[key] deletes a permissions key, rendering it invalid.
 *                   DeletePermissionsKey[{key , key , …}] deletes several permissions keys.
 * Usage:                                     1     2
 *
 * Options:          CloudBase -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeletePermissionsKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeletePermissionsKey.html
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
fun deletePermissionsKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeletePermissionsKey", arguments.toMutableList(), options)
}
