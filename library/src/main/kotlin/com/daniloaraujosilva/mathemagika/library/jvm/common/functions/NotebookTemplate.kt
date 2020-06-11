package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookTemplate
 *
 * Full name:        System`NotebookTemplate
 *
 * Usage:            NotebookTemplate[nb] yields a TemplateObject that represents a notebook template to be applied using functions like GenerateDocument and FileTemplateApply.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookTemplate
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookTemplate.html
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
fun notebookTemplate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookTemplate", arguments.toMutableList(), options)
}
