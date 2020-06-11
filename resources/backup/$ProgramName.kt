package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Mathematica
 *
 * Full name:        Missing[UnknownSymbol, Mathematica]
 *
 * Usage:            Missing[UnknownSymbol, Mathematica]
 *
 * Options:          Missing[UnknownSymbol, Mathematica]
 *
 * Attributes:       Missing[UnknownSymbol, Mathematica]
 *
 *                   local: <>Missing[UnknownSymbol, Mathematica][Local]
 * Documentation:    web: <>Missing[UnknownSymbol, Mathematica][Web]
 *
 * Definitions:      Missing[UnknownSymbol, Mathematica]
 *
 * Own values:       Missing[UnknownSymbol, Mathematica]
 *
 * Down values:      Missing[UnknownSymbol, Mathematica]
 *
 * Up values:        Missing[UnknownSymbol, Mathematica]
 *
 * Sub values:       Missing[UnknownSymbol, Mathematica]
 *
 * Default value:    Missing[UnknownSymbol, Mathematica]
 *
 * Numeric values:   Missing[UnknownSymbol, Mathematica]
 */
fun `$ProgramName`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ProgramName", arguments.toMutableList(), options)
}
