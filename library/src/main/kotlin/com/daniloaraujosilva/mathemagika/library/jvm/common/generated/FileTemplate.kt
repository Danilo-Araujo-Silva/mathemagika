package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FileTemplate
 * 
 * Full name:        System`FileTemplate
 * 
 *                   FileTemplate["file"] yields a TemplateObject expression that represents a file template to be applied using functions like TemplateApply.
 *                   FileTemplate[src] uses File[…], URL[…], or CloudObject[…] as the specification for the file location.
 * Usage:            FileTemplate[form, args] yields a TemplateObject with arguments, suitable for cloud deployment or other evaluation.
 * 
 *                   CombinerFunction -> Automatic
 *                   Delimiters -> Automatic
 *                   InsertionFunction -> Automatic
 * Options:          Path :> $TemplatePath
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FileTemplate
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileTemplate.html
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
fun fileTemplate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileTemplate", arguments.toMutableList(), options)
}
