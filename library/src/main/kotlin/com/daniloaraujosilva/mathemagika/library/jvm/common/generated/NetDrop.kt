package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NetDrop
 * 
 * Full name:        System`NetDrop
 * 
 *                   NetDrop[chain, n] removes the first n layers from a NetChain.
 *                   NetDrop[chain, -n] removes the last n layers from a NetChain.
 * Usage:            NetDrop[chain, {start, end}] drops the layers between start and end in a NetChain.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NetDrop
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetDrop.html
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
fun netDrop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetDrop", arguments.toMutableList(), options)
}
