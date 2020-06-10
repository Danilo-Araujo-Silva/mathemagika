package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FileHash
 * 
 * Full name:        System`FileHash
 * 
 *                   FileHash[file] gives an integer hash code for the contents of the specified file.
 *                   FileHash[file, "type"] gives an integer hash of the specified type.
 *                   FileHash[file, "type", "format"] gives a hash code in the specified format.
 *                   FileHash[{file, range}, …] gives the hash code for the specified range of bytes.
 *                   FileHash[{filespec , filespec , …}, …] gives the hash codes for a list of files.
 * Usage:                              1          2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FileHash
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileHash.html
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
fun fileHash(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileHash", arguments.toMutableList(), options)
}
