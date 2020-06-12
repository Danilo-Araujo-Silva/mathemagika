package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetPrepend
 *
 * Full name:        System`NetPrepend
 *
 *                   NetPrepend[chain, layer] prepends a layer onto a NetChain.
 *                   NetPrepend[chain, {layer , layer , …}] prepends several layers to a NetChain.
 * Usage:                                    1       2
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetPrepend
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetPrepend.html
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
fun netPrepend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetPrepend", arguments.toMutableList(), options)
}
