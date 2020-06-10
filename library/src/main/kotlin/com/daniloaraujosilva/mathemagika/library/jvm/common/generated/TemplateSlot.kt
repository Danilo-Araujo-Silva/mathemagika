package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TemplateSlot
 * 
 * Full name:        System`TemplateSlot
 * 
 *                                                                                      th
 *                   TemplateSlot[n] represents a template slot to be filled from the n   argument when the template is applied.
 * Usage:            TemplateSlot[name] represents a template slot to be filled from an element with key name in an association appearing in the first argument.
 * 
 *                   DefaultValue -> Inherited
 * Options:          InsertionFunction -> Inherited
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TemplateSlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateSlot.html
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
fun templateSlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateSlot", arguments.toMutableList(), options)
}
