package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             /Library/Mathematica
 *
 * Full name:        Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Usage:            Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Options:          Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Attributes:       Missing[UnknownSymbol, /Library/Mathematica]
 *
 *                   local: <>Missing[UnknownSymbol, /Library/Mathematica][Local]
 * Documentation:    web: <>Missing[UnknownSymbol, /Library/Mathematica][Web]
 *
 * Definitions:      Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Own values:       Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Down values:      Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Up values:        Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Sub values:       Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Default value:    Missing[UnknownSymbol, /Library/Mathematica]
 *
 * Numeric values:   Missing[UnknownSymbol, /Library/Mathematica]
 */
fun `$BaseDirectory`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$BaseDirectory", arguments.toMutableList(), options)
}
