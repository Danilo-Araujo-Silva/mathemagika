package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AutoOpenPalettes
 *
 * Full name:        System`AutoOpenPalettes
 *
 * Usage:            AutoOpenPalettes is a global option that specifies the palettes that are automatically opened when the Wolfram System is started.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoOpenPalettes
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoOpenPalettes.html
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
fun autoOpenPalettes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoOpenPalettes", arguments.toMutableList(), options)
}
