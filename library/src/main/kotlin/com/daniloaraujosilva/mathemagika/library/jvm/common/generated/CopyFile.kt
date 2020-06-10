package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CopyFile
 * 
 * Full name:        System`CopyFile
 * 
 *                   CopyFile[file , file ] copies from the local, remote or cloud file file  to the local, remote or cloud file file . 
 * Usage:                         1      2                                                  1                                        2
 * 
 *                   MIMEType -> Automatic
 * Options:          OverwriteTarget -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CopyFile
 * Documentation:    web: http://reference.wolfram.com/language/ref/CopyFile.html
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
fun copyFile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CopyFile", arguments.toMutableList(), options)
}
