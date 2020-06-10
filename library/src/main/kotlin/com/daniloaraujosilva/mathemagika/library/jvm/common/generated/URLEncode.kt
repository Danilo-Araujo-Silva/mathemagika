package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             URLEncode
 * 
 * Full name:        System`URLEncode
 * 
 * Usage:            URLEncode["string"] converts "string" into a URL-style, percent-encoded ASCII string. 
 * 
 * Options:          CharacterEncoding -> UTF-8
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/URLEncode
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLEncode.html
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
fun uRLEncode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLEncode", arguments.toMutableList(), options)
}
