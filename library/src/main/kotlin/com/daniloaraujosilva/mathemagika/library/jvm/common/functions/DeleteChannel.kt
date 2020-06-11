package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteChannel
 *
 * Full name:        System`DeleteChannel
 *
 *                   DeleteChannel[channel] deletes the specified channel from the channel broker server.
 *                   DeleteChannel[{channel , channel , …}] deletes all the channel .
 *                                         1         2                             i
 * Usage:            DeleteChannel[All] deletes all channels owned by the currently authenticated user.
 *
 * Options:          ChannelBase :> $ChannelBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteChannel
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteChannel.html
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
fun deleteChannel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteChannel", arguments.toMutableList(), options)
}
