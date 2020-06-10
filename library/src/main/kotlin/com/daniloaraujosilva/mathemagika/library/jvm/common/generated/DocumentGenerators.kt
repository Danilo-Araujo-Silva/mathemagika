package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DocumentGenerators
 * 
 * Full name:        System`DocumentGenerators
 * 
 * Usage:            DocumentGenerators[] returns a list of the user's document generators, as cloud objects.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DocumentGenerators
 * Documentation:    web: http://reference.wolfram.com/language/ref/DocumentGenerators.html
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
fun documentGenerators(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DocumentGenerators", arguments.toMutableList(), options)
}
