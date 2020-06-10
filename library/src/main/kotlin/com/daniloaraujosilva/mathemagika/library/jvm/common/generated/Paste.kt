package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Paste
 * 
 * Full name:        System`Paste
 * 
 *                   Paste[expr] pastes expr at the current insertion point in the input notebook. 
 *                   Paste[notebook, expr] pastes expr to the specified notebook.
 * Usage:            Paste[] pastes the contents of the system clipboard in the input notebook. 
 * 
 *                   AutoScroll -> True
 * Options:          PlaceholderReplace -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Paste
 * Documentation:    web: http://reference.wolfram.com/language/ref/Paste.html
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
fun paste(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Paste", arguments.toMutableList(), options)
}
