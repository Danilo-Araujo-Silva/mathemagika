package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageFormattingWidth
 *
 * Full name:        System`ImageFormattingWidth
 *
 * Usage:            ImageFormattingWidth is an option that specifies the target width at which to wrap when formatting an object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageFormattingWidth
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageFormattingWidth.html
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
fun imageFormattingWidth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageFormattingWidth", arguments.toMutableList(), options)
}
