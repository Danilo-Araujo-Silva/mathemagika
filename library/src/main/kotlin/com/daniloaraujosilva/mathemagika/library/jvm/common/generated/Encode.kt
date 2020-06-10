package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Encode
 * 
 * Full name:        System`Encode
 * 
 *                   Encode["source", "dest"] writes an encoded version of the file source to the file dest. 
 *                   << dest decodes the file before reading its contents. 
 * Usage:            Encode["source", "dest", "key"] produces an encoded file that must be read in using Get["dest", "key"]. 
 * 
 *                   LicenseID -> 
 *                   MachineID -> 
 * Options:          MachineName -> 
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Encode
 * Documentation:    web: http://reference.wolfram.com/language/ref/Encode.html
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
fun encode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Encode", arguments.toMutableList(), options)
}
