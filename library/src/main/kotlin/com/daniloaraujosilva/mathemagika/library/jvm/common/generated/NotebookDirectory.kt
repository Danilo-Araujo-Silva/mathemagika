package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NotebookDirectory
 * 
 * Full name:        System`NotebookDirectory
 * 
 *                   NotebookDirectory[] gives the directory of the current evaluation notebook. 
 * Usage:            NotebookDirectory[nb] gives the directory for the notebook specified by nb. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NotebookDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookDirectory.html
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
fun notebookDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookDirectory", arguments.toMutableList(), options)
}
