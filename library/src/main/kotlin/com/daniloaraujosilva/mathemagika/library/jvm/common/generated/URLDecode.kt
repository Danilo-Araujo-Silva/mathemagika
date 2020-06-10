package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             URLDecode
 * 
 * Full name:        System`URLDecode
 * 
 * Usage:            URLDecode["string"] decodes a URL-style percent-encoded string.
 * 
 * Options:          CharacterEncoding -> UTF-8
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/URLDecode
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLDecode.html
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
fun uRLDecode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLDecode", arguments.toMutableList(), options)
}
