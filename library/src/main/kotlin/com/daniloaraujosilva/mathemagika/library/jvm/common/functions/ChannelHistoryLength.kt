package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChannelHistoryLength
 *
 * Full name:        System`ChannelHistoryLength
 *
 * Usage:            ChannelHistoryLength is an option to ChannelListen that specifies the maximum number of messages to cache in the channel listener object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChannelHistoryLength
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChannelHistoryLength.html
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
fun channelHistoryLength(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChannelHistoryLength", arguments.toMutableList(), options)
}
