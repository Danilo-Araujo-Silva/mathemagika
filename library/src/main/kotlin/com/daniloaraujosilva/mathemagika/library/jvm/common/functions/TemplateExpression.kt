package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TemplateExpression
 *
 * Full name:        System`TemplateExpression
 *
 * Usage:            TemplateExpression[expr] represents an expression held until a template is applied, and then evaluated.
 *
 * Options:          InsertionFunction -> Inherited
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TemplateExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateExpression.html
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
fun templateExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateExpression", arguments.toMutableList(), options)
}
