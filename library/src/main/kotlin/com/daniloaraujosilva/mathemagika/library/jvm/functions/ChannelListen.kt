package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChannelListen
 *
 * Full name:        System`ChannelListen
 *
 *                   ChannelListen[channel] starts listening on the specified channel.
 *                   ChannelListen[channel, func] applies func to the association corresponding to each message received on the channel.
 *                   ChannelListen[channel, None] stores each message received on the channel, without applying any function.
 * Usage:            ChannelListen[url] listens on the specified URL, storing messages received, without requiring an explicit channel to exist on the channel broker.
 *
 *                   AutoRemove -> False
 *                   ChannelBase :> $ChannelBase
 *                   ChannelDatabin -> None
 *                   ChannelHistoryLength -> 100
 *                   NotificationFunction -> Inherited
 *                   Permissions -> Automatic
 * Options:          URLRendering -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChannelListen
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChannelListen.html
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
fun channelListen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChannelListen", arguments.toMutableList(), options)
}
