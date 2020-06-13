package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             /Library/Mathematica/Paclets
 *
 * Full name:        Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Usage:            Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Options:          Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Attributes:       Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 *                   local: <>Missing[UnknownSymbol, /Library/Mathematica/Paclets][Local]
 * Documentation:    web: <>Missing[UnknownSymbol, /Library/Mathematica/Paclets][Web]
 *
 * Definitions:      Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Own values:       Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Down values:      Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Up values:        Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Sub values:       Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Default value:    Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 *
 * Numeric values:   Missing[UnknownSymbol, /Library/Mathematica/Paclets]
 */
fun `$BasePacletsDirectory`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$BasePacletsDirectory", arguments.toMutableList(), options)
}
