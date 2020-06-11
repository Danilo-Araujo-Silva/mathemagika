package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $DefaultSystemCredentialStore
 *
 * Full name:        System`$DefaultSystemCredentialStore
 *
 * Usage:            $DefaultSystemCredentialStore gives the default credential store settings.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/$DefaultSystemCredentialStore
 * Documentation:    web: http://reference.wolfram.com/language/ref/$DefaultSystemCredentialStore.html
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
fun `$DefaultSystemCredentialStore`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$DefaultSystemCredentialStore", arguments.toMutableList(), options)
}
