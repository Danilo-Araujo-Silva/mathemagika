package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CloudSymbol
 * 
 * Full name:        System`CloudSymbol
 * 
 *                   CloudSymbol["name"] represents a symbol whose value is persistently stored in the cloud.
 *                   CloudSymbol[obj] represents a persistent symbol corresponding to the cloud object obj.
 * Usage:            CloudSymbol["uri"] represents a cloud symbol located at a given URI.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CloudSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudSymbol.html
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
fun cloudSymbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudSymbol", arguments.toMutableList(), options)
}
