package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveChannelSubscribers
 *
 * Full name:        System`RemoveChannelSubscribers
 *
 *                   RemoveChannelSubscribers[channel] removes all subscribers from the specified channel.
 *                   RemoveChannelSubscribers[channel, user] removes the specified user from the subscriber list.
 *                   RemoveChannelSubscribers[channel, {user , user , …}] removes the specified subscribers user .
 * Usage:                                                   1      2                                            i
 *
 * Options:          ChannelBase :> $ChannelBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveChannelSubscribers
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveChannelSubscribers.html
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
fun removeChannelSubscribers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveChannelSubscribers", arguments.toMutableList(), options)
}
