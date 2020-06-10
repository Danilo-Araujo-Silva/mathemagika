package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DefaultNotebook
 * 
 * Full name:        System`DefaultNotebook
 * 
 * Usage:            DefaultNotebook is a global option that specifies which notebook is used as a template for all new notebooks.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DefaultNotebook
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultNotebook.html
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
fun defaultNotebook(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultNotebook", arguments.toMutableList(), options)
}
