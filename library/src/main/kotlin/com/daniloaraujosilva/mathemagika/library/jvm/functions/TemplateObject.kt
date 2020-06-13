package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TemplateObject
 *
 * Full name:        System`TemplateObject
 *
 *                   TemplateObject[expr] represents a template object to be applied using functions like TemplateApply.
 * Usage:            TemplateObject[form, args] yields a TemplateObject with arguments, suitable for cloud deployment or other evaluation.
 *
 *                   CombinerFunction -> Inherited
 * Options:          InsertionFunction -> Inherited
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TemplateObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateObject.html
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
fun templateObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateObject", arguments.toMutableList(), options)
}
