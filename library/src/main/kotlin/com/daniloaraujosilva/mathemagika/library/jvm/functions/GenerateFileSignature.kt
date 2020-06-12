package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GenerateFileSignature
 *
 * Full name:        System`GenerateFileSignature
 *
 *                   GenerateFileSignature["file", key] generates a digital signature of file using the specified private key.
 *                   GenerateFileSignature[{"file", range}, key] generates a digital signature of the specified range of bytes in the file.
 *                   GenerateFileSignature[{{file , range }, {file , range }, …}, key] generates digital signatures for each specified file  and range .
 *                                               1       1        2       2                                                                i          i
 * Usage:            GenerateFileSignature[key] represents an operator form of GenerateFileSignature that can be applied to files.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GenerateFileSignature
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateFileSignature.html
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
fun generateFileSignature(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateFileSignature", arguments.toMutableList(), options)
}
