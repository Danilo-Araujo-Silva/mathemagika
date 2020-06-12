package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FileConvert
 *
 * Full name:        System`FileConvert
 *
 *                   FileConvert[source  "dest.ext"] converts the contents of source to the format defined by the extension ext and writes the result to the file dest . ext.
 *                   FileConvert[source, "format"] writes the result to the filename defined by source, but with an extension defined by the specified format.
 *                   FileConvert[source  "dest.ext", format   format ] takes the contents of source to be in the specified format "format ".
 * Usage:                                                   1         2                                                                    1
 *
 *                   CreateIntermediateDirectories -> True
 * Options:          OverwriteTarget -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FileConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileConvert.html
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
fun fileConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileConvert", arguments.toMutableList(), options)
}
