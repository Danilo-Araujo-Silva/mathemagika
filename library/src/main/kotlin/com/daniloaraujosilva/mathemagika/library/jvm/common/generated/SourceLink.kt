package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SourceLink
 * 
 * Full name:        System`SourceLink
 * 
 * Usage:            SourceLink is an option for CloudObject and related cloud functions that specifies the source of the content given.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SourceLink
 * Documentation:    web: http://reference.wolfram.com/language/ref/SourceLink.html
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
fun sourceLink(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SourceLink", arguments.toMutableList(), options)
}
