package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NetDelete
 * 
 * Full name:        System`NetDelete
 * 
 *                                                   th
 *                   NetDelete[net, n] deletes the n   layer from a NetChain or NetGraph.
 *                   NetDelete[net, "name"] deletes a named layer.
 *                   NetDelete[net, {spec , spec , …}] deletes several layers simultaneously.
 * Usage:                                1      2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NetDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetDelete.html
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
fun netDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetDelete", arguments.toMutableList(), options)
}
