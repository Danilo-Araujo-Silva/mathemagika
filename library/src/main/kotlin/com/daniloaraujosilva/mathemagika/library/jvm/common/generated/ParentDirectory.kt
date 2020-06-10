package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParentDirectory
 * 
 * Full name:        System`ParentDirectory
 * 
 *                   ParentDirectory[] gives the parent of the current working directory. 
 *                   ParentDirectory["dir"] gives the parent of the directory dir. 
 * Usage:            ParentDirectory["dir", n] gives the directory n levels up from dir.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ParentDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParentDirectory.html
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
fun parentDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParentDirectory", arguments.toMutableList(), options)
}
