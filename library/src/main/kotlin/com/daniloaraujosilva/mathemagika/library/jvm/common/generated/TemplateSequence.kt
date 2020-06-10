package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TemplateSequence
 * 
 * Full name:        System`TemplateSequence
 * 
 * Usage:            TemplateSequence[body, list] represents an element of a template object that yields a sequence consisting of body applied to each element in list.
 * 
 *                   DefaultValue -> Sequence[]
 *                   Delimiters -> Sequence[]
 * Options:          InsertionFunction -> Inherited
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TemplateSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateSequence.html
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
fun templateSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateSequence", arguments.toMutableList(), options)
}
