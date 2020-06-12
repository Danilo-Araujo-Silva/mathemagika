package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:
 *
 * Full name:        Missing[UnknownSymbol, 	]
 *
 * Usage:            Missing[UnknownSymbol, 	]
 *
 * Options:          Missing[UnknownSymbol, 	]
 *
 * Attributes:       Missing[UnknownSymbol, 	]
 *
 *                   local: <>Missing[UnknownSymbol, 	][Local]
 * Documentation:    web: <>Missing[UnknownSymbol, 	][Web]
 *
 * Definitions:      Missing[UnknownSymbol, 	]
 *
 * Own values:       Missing[UnknownSymbol, 	]
 *
 * Down values:      Missing[UnknownSymbol, 	]
 *
 * Up values:        Missing[UnknownSymbol, 	]
 *
 * Sub values:       Missing[UnknownSymbol, 	]
 *
 * Default value:    Missing[UnknownSymbol, 	]
 *
 * Numeric values:   Missing[UnknownSymbol, 	]
 */
fun tab(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tab", arguments.toMutableList(), options)
}
