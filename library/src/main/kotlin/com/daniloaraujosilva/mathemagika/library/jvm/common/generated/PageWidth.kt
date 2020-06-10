package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PageWidth
 * 
 * Full name:        System`PageWidth
 * 
 * Usage:            PageWidth is an option for output streams and for cells that specifies how wide each line of text is allowed to be.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PageWidth
 * Documentation:    web: http://reference.wolfram.com/language/ref/PageWidth.html
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
fun pageWidth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PageWidth", arguments.toMutableList(), options)
}
