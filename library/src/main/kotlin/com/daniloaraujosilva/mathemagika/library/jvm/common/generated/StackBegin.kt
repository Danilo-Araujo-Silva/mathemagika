package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StackBegin
 * 
 * Full name:        System`StackBegin
 * 
 * Usage:            StackBegin[expr] evaluates expr, starting a fresh evaluation stack. 
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/StackBegin
 * Documentation:    web: http://reference.wolfram.com/language/ref/StackBegin.html
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
fun stackBegin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StackBegin", arguments.toMutableList(), options)
}
