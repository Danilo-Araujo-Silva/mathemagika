package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EmbeddedHTML
 * 
 * Full name:        System`EmbeddedHTML
 * 
 *                   EmbeddedHTML["string"] is an object that formats as a web frame containing the HTML content "string". 
 *                   EmbeddedHTML[URL["url"]] formats as a rendering of the webpage corresponding to the specified URL.
 * Usage:            EmbeddedHTML[CloudObject[…]] formats as a web rendering of the specified cloud object.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EmbeddedHTML
 * Documentation:    web: http://reference.wolfram.com/language/ref/EmbeddedHTML.html
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
fun embeddedHTML(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EmbeddedHTML", arguments.toMutableList(), options)
}
