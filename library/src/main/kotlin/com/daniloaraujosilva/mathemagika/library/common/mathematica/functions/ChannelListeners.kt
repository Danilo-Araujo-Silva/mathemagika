package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ChannelListeners
 *
 * Full name:        System`ChannelListeners
 *
 * Usage:            ChannelListeners[] gives a list of currently active channel listeners.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChannelListeners
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChannelListeners.html
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
fun channelListeners(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChannelListeners", arguments.toMutableList(), options)
}
