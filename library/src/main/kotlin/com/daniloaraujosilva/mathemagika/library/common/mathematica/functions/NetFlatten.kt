package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NetFlatten
 *
 * Full name:        System`NetFlatten
 *
 *                   NetFlatten[net] collapses nested NetChain and NetGraph objects within net.
 * Usage:            NetFlatten[net, n] collapses up to nesting level n.
 *
 * Options:          AllowedHeads -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetFlatten
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetFlatten.html
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
fun netFlatten(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetFlatten", arguments.toMutableList(), options)
}
