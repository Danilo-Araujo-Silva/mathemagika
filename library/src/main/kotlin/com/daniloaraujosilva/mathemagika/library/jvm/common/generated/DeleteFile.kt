package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DeleteFile
 * 
 * Full name:        System`DeleteFile
 * 
 *                   DeleteFile["file"] deletes a file. 
 *                   DeleteFile[{"file ", "file ", …}] deletes a list of files. 
 * Usage:                             1        2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DeleteFile
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteFile.html
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
fun deleteFile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteFile", arguments.toMutableList(), options)
}
