package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TemplateWith
 *
 * Full name:        System`TemplateWith
 *
 *                   TemplateWith["name"  value, expr] represents an element of a template object that evaluates expr after replacing TemplateSlot["name"] with value.
 *                   TemplateWith[{name   value , name   value , …}, expr] evaluates expr with a list of key-value pairs.
 * Usage:                              1        1      2        2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TemplateWith
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateWith.html
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
fun templateWith(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateWith", arguments.toMutableList(), options)
}
