package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TemplateApply
 *
 * Full name:        System`TemplateApply
 *
 *                   TemplateApply[template] applies a template, evaluating all template elements it contains.
 * Usage:            TemplateApply[template, args] applies a template, using args to fill slots in the template.
 *
 *                   CombinerFunction -> Inherited
 * Options:          InsertionFunction -> Inherited
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TemplateApply
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateApply.html
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
fun templateApply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateApply", arguments.toMutableList(), options)
}
