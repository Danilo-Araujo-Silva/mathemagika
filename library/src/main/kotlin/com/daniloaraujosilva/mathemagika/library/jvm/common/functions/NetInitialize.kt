package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetInitialize
 *
 * Full name:        System`NetInitialize
 *
 *                   NetInitialize[net] gives a net in which all uninitialized learnable parameters in net have been given initial values.
 * Usage:            NetInitialize[net, All] gives a net in which all learnable parameters have been given initial values.
 *
 *                   Method -> Automatic
 *                   RandomSeeding -> Inherited
 * Options:          SamplingFunction -> RandomVariate
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetInitialize
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetInitialize.html
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
fun netInitialize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetInitialize", arguments.toMutableList(), options)
}
