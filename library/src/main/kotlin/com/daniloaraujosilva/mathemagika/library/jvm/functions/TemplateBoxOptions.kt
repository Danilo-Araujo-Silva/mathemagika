package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TemplateBoxOptions
 *
 * Full name:        System`TemplateBoxOptions
 *
 * Usage:            TemplateBoxOptions is an option that specifies settings for TemplateBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TemplateBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateBoxOptions.html
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
fun templateBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateBoxOptions", arguments.toMutableList(), options)
}
