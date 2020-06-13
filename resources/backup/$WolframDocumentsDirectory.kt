package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             /Users/danilo/Documents/Wolfram
 *
 * Full name:        Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Usage:            Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Options:          Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Attributes:       Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 *                   local: <>Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram][Local]
 * Documentation:    web: <>Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram][Web]
 *
 * Definitions:      Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Own values:       Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Down values:      Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Up values:        Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Sub values:       Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Default value:    Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 *
 * Numeric values:   Missing[UnknownSymbol, /Users/danilo/Documents/Wolfram]
 */
fun `$WolframDocumentsDirectory`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$WolframDocumentsDirectory", arguments.toMutableList(), options)
}
