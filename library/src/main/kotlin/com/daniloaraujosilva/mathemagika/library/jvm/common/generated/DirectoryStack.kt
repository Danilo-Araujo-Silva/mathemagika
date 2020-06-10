package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DirectoryStack
 * 
 * Full name:        System`DirectoryStack
 * 
 * Usage:            DirectoryStack[] gives the directory stack that represents the sequence of current directories used. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DirectoryStack
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirectoryStack.html
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
fun directoryStack(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirectoryStack", arguments.toMutableList(), options)
}
