package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LocalSymbol
 * 
 * Full name:        System`LocalSymbol
 * 
 *                   LocalSymbol["name"] represents a symbol whose value is persistently stored in the local file system.
 * Usage:            LocalSymbol[obj] represents a persistent symbol corresponding to the local object obj.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LocalSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalSymbol.html
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
 * Default value:    SyntaxInformation[LocalSymbol] = {"ArgumentsPattern" -> {_}}
 * 
 * Numeric values:   None
 */
fun localSymbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalSymbol", arguments.toMutableList(), options)
}
