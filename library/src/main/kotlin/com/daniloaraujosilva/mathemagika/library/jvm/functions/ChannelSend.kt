package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChannelSend
 *
 * Full name:        System`ChannelSend
 *
 * Usage:            ChannelSend[channel, msg] sends the specified message msg to the specified channel.
 *
 *                   ChannelBase :> $ChannelBase
 * Options:          ChannelPreSendFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChannelSend
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChannelSend.html
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
fun channelSend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChannelSend", arguments.toMutableList(), options)
}
