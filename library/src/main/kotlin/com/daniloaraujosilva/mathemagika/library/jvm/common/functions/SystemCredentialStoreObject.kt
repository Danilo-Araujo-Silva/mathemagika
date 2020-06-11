package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemCredentialStoreObject
 *
 * Full name:        System`SystemCredentialStoreObject
 *
 * Usage:            SystemCredentialStoreObject[assoc] represents a credential store.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemCredentialStoreObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemCredentialStoreObject.html
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
fun systemCredentialStoreObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemCredentialStoreObject", arguments.toMutableList(), options)
}
