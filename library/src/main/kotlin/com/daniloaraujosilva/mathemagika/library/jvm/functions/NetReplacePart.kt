package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetReplacePart
 *
 * Full name:        System`NetReplacePart
 *
 *                   NetReplacePart[layer, "array"  value] replaces an array within a layer, returning a new layer.
 *                   NetReplacePart[net, "port"  type] returns a new layer or network in which an input or output port has the specified type.
 *                   NetReplacePart[net, "input"  encoder] attaches a NetEncoder[…] to a specified input port.
 *                   NetReplacePart[net, "output"  decoder] attaches a NetDecoder[…] to a specified output port.
 *                   NetReplacePart[net, lspec  layer] returns a new NetChain or NetGraph in which the layer identified by lspec has been replaced.
 *                   NetReplacePart[net, NetSharedArray[name]  value] sets a shared array within a network or layer to a specified value.
 *                   NetReplacePart[coder, "param"  value] returns a new NetEncoder[…] or NetDecoder[…] in which a parameter has been replaced.
 *                   NetReplacePart[net, {lspec, pspec}  value] makes a replacement of a part pspec of a layer or coder lspec within a NetGraph or NetChain.
 *                   NetReplacePart[…, {spec   val , spec   val , …}] makes multiple simultaneous replacements.
 * Usage:                                   1      1      2      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetReplacePart
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetReplacePart.html
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
fun netReplacePart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetReplacePart", arguments.toMutableList(), options)
}
