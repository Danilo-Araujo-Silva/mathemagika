package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             /Applications/Mathematica.app/Contents/MacOS
 *
 * Full name:        Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Usage:            Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Options:          Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Attributes:       Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 *                   local: <>Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS][Local]
 * Documentation:    web: <>Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS][Web]
 *
 * Definitions:      Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Own values:       Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Down values:      Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Up values:        Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Sub values:       Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Default value:    Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 *
 * Numeric values:   Missing[UnknownSymbol, /Applications/Mathematica.app/Contents/MacOS]
 */
fun `$LaunchDirectory`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$LaunchDirectory", arguments.toMutableList(), options)
}
