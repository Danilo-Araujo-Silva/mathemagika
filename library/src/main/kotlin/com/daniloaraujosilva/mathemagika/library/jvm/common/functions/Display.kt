package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Display
 *
 * Full name:        System`Display
 *
 *                   Display[channel, graphics] writes graphics or sound to the specified output channel in PostScript format.
 *                   Display[channel, graphics, "format"] writes graphics or sound in the specified format.
 * Usage:            Display[channel, expr, "format"] writes boxes, cells, or notebook expressions in the specified format.
 *
 *                   CharacterEncoding -> {}
 *                   ImageOffset -> Automatic
 *                   ImageResolution -> Automatic
 *                   ImageRotated -> False
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Display
 * Documentation:    web: http://reference.wolfram.com/language/ref/Display.html
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
fun display(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Display", arguments.toMutableList(), options)
}
