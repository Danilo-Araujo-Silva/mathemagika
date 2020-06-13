package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CreateChannel
 *
 * Full name:        System`CreateChannel
 *
 *                   CreateChannel[] creates a new channel for channel communication, with a generated name.
 *                   CreateChannel["path"] creates a channel with the specified path relative to the home area of the currently authenticated user.
 * Usage:            CreateChannel[object] creates a channel based on the given ChannelObject specification.
 *
 *                   ChannelBase :> $ChannelBase
 *                   ChannelBrokerAction -> Automatic
 *                   ChannelPreSendFunction -> Automatic
 *                   HandlerFunctions -> Automatic
 *                   Initialization -> Automatic
 *                   MetaInformation -> {}
 *                   Method -> Automatic
 *                   NotificationFunction -> Inherited
 *                   Permissions -> Automatic
 * Options:          URLRendering -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateChannel
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateChannel.html
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
fun createChannel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateChannel", arguments.toMutableList(), options)
}
