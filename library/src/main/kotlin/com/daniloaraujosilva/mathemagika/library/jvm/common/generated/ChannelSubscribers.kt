package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ChannelSubscribers
 * 
 * Full name:        System`ChannelSubscribers
 * 
 *                   ChannelSubscribers[channel] gives a list of users currently subscribed to the specified channel.
 *                   ChannelSubscribers[{channel , channel , …}] gives a list of subscribed users for each of the channels channel .
 * Usage:                                       1         2                                                                       i
 * 
 * Options:          ChannelBase :> $ChannelBase
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ChannelSubscribers
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChannelSubscribers.html
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
fun channelSubscribers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChannelSubscribers", arguments.toMutableList(), options)
}
