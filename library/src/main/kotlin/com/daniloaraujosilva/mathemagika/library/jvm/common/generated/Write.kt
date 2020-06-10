package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Write
 * 
 * Full name:        System`Write
 * 
 *                   Write[channel, expr , expr , …] writes the expressions expr  in sequence, followed by a newline, to the specified output channel.
 * Usage:                               1      2                                i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Write
 * Documentation:    web: http://reference.wolfram.com/language/ref/Write.html
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
fun write(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Write", arguments.toMutableList(), options)
}
