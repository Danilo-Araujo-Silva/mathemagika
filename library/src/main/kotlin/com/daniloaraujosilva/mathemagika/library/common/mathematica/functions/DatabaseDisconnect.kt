package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DatabaseDisconnect
 *
 * Full name:        System`DatabaseDisconnect
 *
 * Usage:            DatabaseDisconnect[db] deactivates a connection to the database db.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DatabaseDisconnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/DatabaseDisconnect.html
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
fun databaseDisconnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatabaseDisconnect", arguments.toMutableList(), options)
}
