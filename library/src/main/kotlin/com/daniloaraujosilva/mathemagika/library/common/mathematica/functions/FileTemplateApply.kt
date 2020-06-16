package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FileTemplateApply
 *
 * Full name:        System`FileTemplateApply
 *
 *                   FileTemplateApply[template] applies a template, evaluating all template elements it contains, and then writes the result to a temporary file, whose name is returned.
 *                   FileTemplateApply[template, args] applies a template, using args to fill its slots, and then writes the result to a temporary file.
 *                   FileTemplateApply[template, output] applies a template, writing the results to the file represented by output.
 * Usage:            FileTemplateApply[template, args, output] applies a template, using args to fill its slots, and then writes the result to the file represented by output.
 *
 *                   CombinerFunction -> Inherited
 * Options:          InsertionFunction -> Inherited
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FileTemplateApply
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileTemplateApply.html
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
fun fileTemplateApply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileTemplateApply", arguments.toMutableList(), options)
}
