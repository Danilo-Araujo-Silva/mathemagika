package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImportByteArray
 * 
 * Full name:        System`ImportByteArray
 * 
 *                   ImportByteArray[ba, "format"] imports data in the specified format from a ByteArray object.
 *                   ImportByteArray[ba, elements] imports the specified elements.
 * Usage:            ImportByteArray[ba] attempts to determine the format automatically.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImportByteArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImportByteArray.html
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
fun importByteArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImportByteArray", arguments.toMutableList(), options)
}
