package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NetExtract
 *
 * Full name:        System`NetExtract
 *
 *                   NetExtract[layer, "param"] extracts the value of a parameter for the specified net layer.
 *                   NetExtract[net, lspec] extracts the layer identified by lspec from within the NetGraph or NetChain object net.
 *                   NetExtract[net, {lspec, "param"}] extracts the value of the parameter param from the layer identified by lspec in net.
 *                   NetExtract[net, NetSharedArray[spec]] extracts the value of a shared array within a network or layer.
 *                   NetExtract[coder, "param"] extracts the value of a parameter for the specified NetEncoder or NetDecoder.
 *                   NetExtract[…, {spec , spec , …}] extracts a set of elements, where each spec  is a list.
 * Usage:                               1      2                                                 i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetExtract
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetExtract.html
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
fun netExtract(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetExtract", arguments.toMutableList(), options)
}
