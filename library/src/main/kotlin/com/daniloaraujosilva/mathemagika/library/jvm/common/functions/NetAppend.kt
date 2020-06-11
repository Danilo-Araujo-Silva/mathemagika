package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetAppend
 *
 * Full name:        System`NetAppend
 *
 *                   NetAppend[chain, layer] appends a layer onto a NetChain.
 *                   NetAppend[chain, {layer , layer , …}] appends several layers to a NetChain.
 * Usage:                                   1       2
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetAppend
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetAppend.html
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
fun netAppend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetAppend", arguments.toMutableList(), options)
}
