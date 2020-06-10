package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EmbedCode
 * 
 * Full name:        System`EmbedCode
 * 
 *                   EmbedCode[obj] generates the code necessary to embed the object obj on a webpage.
 *                   EmbedCode[obj, "dest"] generates code for an external environment or language of type "dest".
 *                   EmbedCode[obj, "dest", dir] saves the generated code as files in the directory dir.
 * Usage:            EmbedCode[obj, "dest", loc] saves the generated code as a file archive in the file location loc.
 * 
 *                   ExternalFunctionName -> Automatic
 *                   ExternalOptions -> <||>
 *                   ExternalTypeSignature -> Automatic
 *                   ImageSize -> Automatic
 * Options:          Permissions -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EmbedCode
 * Documentation:    web: http://reference.wolfram.com/language/ref/EmbedCode.html
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
fun embedCode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EmbedCode", arguments.toMutableList(), options)
}
