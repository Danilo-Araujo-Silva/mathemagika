package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Missing[NotAvailable]
 *
 * Full name:        Information[Missing[NotAvailable], FullName]
 *
 * Usage:            Information[Missing[NotAvailable], Usage]
 *
 * Options:          Information[Missing[NotAvailable], Options]
 *
 * Attributes:       Information[Missing[NotAvailable], Attributes]
 *
 *                   local: <>Information[Missing[NotAvailable], Documentation][Local]
 * Documentation:    web: <>Information[Missing[NotAvailable], Documentation][Web]
 *
 * Definitions:      Information[Missing[NotAvailable], Definitions]
 *
 * Own values:       Information[Missing[NotAvailable], OwnValues]
 *
 * Down values:      Information[Missing[NotAvailable], DownValues]
 *
 * Up values:        Information[Missing[NotAvailable], UpValues]
 *
 * Sub values:       Information[Missing[NotAvailable], SubValues]
 *
 * Default value:    Information[Missing[NotAvailable], DefaultValues]
 *
 * Numeric values:   Information[Missing[NotAvailable], NValues]
 */
fun here(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Here", arguments.toMutableList(), options)
}
