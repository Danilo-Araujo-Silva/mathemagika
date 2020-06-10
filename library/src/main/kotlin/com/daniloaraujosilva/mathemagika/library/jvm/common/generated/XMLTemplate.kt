package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             XMLTemplate
 * 
 * Full name:        System`XMLTemplate
 * 
 *                   XMLTemplate["string"] yields a TemplateObject that represents an XML template to be applied using functions like TemplateApply.
 *                   XMLTemplate[src] uses File[…], URL[…], or CloudObject[…] as the source for the string template.
 * Usage:            XMLTemplate[form, args] yields a TemplateObject with arguments, suitable for cloud deployment or other evaluation.
 * 
 *                   CombinerFunction -> StringJoin
 *                   Delimiters -> Automatic
 * Options:          InsertionFunction -> HTMLFragment
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/XMLTemplate
 * Documentation:    web: http://reference.wolfram.com/language/ref/XMLTemplate.html
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
fun xMLTemplate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("XMLTemplate", arguments.toMutableList(), options)
}
