package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SingleLetterItalics
 *
 * Full name:        System`SingleLetterItalics
 *
 * Usage:            SingleLetterItalics is an option for Cell that specifies whether single‐letter names should be displayed in italics.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SingleLetterItalics
 * Documentation:    web: http://reference.wolfram.com/language/ref/SingleLetterItalics.html
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
fun singleLetterItalics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SingleLetterItalics", arguments.toMutableList(), options)
}
