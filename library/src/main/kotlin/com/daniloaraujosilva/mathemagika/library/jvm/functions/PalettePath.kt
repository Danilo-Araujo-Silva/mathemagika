package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PalettePath
 *
 * Full name:        System`PalettePath
 *
 * Usage:            PalettePath is a global option that specifies which directories the Wolfram System searches for palettes on startup.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PalettePath
 * Documentation:    web: http://reference.wolfram.com/language/ref/PalettePath.html
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
fun palettePath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PalettePath", arguments.toMutableList(), options)
}
