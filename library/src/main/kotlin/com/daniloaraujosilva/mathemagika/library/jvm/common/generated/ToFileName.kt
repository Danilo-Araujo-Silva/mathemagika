package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ToFileName
 * 
 * Full name:        System`ToFileName
 * 
 *                   ToFileName["directory", "name"] assembles a full file name from a directory name and a file name. 
 *                   ToFileName[{dir , dir , …}, name] assembles a full file name from a hierarchy of directory names. 
 *                                  1     2
 *                   ToFileName[{dir , dir , …}] assembles a single directory name from a hierarchy of directory names. 
 * Usage:                           1     2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ToFileName
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToFileName.html
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
fun toFileName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToFileName", arguments.toMutableList(), options)
}
