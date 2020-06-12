package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TemplateIf
 *
 * Full name:        System`TemplateIf
 *
 *                   TemplateIf[condition, tclause] represents an element of a template object that inserts tclause if the condition evaluates to True.
 * Usage:            TemplateIf[condition, tclause, fclause] inserts fclause if the condition does not evaluate to True.
 *
 * Options:          InsertionFunction -> Inherited
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TemplateIf
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateIf.html
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
fun templateIf(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateIf", arguments.toMutableList(), options)
}
