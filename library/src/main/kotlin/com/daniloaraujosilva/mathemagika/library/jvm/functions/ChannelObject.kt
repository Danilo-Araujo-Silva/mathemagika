package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                              \!RowBox[{"ChannelObject", "[", StyleBox[                                                                            represents a channel specified by a given URL.                                                                                   \!RowBox[{"ChannelObject", "[",                                                                                           represents a channel at an absolute path on the channel broker.
 *````                                                                            *                   RowBox[{RowBox[{"\"mqtts", ":"}], "//", StyleBox["…", "TR"],"\""}], AutoSpacing -> False], "]"}] *                   ChannelObject["relpath"] represents a channel for the currently authenticated user at a relative path.        *                   StyleBox[                                                                                              *
 *                                                                                                                                                                                                      *                   ChannelObject["id : path"] represents a channel for the user with the specified Wolfram ID at the given path. * Usage:            StyleBox[RowBox[{"\"/","abspath\""}], "TI", ShowStringCharacters->True], AutoSpacing -> False], "]"}] *                   ChannelBase :> $ChannelBase
 * Name:             ChannelObject                                                                                                                                                                      *                                                                                                                                                                                                                                                            *                   ChannelBrokerAction -> None
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                   *                   ChannelPreSendFunction -> None
 * Full name:        System`ChannelObject                                                                                                                                                                                                                                                                                                                                                                                                                            *                   HandlerFunctions -> None
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                   *                   Initialization -> None
 *                   ChannelObject[] gives a new anonymous channel specification.                                                                                                                                                                                                                                                                                                                                                                                    *                   MetaInformation -> {}
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                   *                   Method -> Automatic
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     *                   NotificationFunction -> Inherited
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     *                   Permissions -> Automatic
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * Options:          URLRendering -> Automatic
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     *
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     *                   Protected
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * Attributes:       ReadProtected
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     *
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     *                   local: paclet:ref/ChannelObject
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * Documentation:    web: http://reference.wolfram.com/language/ref/ChannelObject.html
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
fun channelObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChannelObject", arguments.toMutableList(), options)
}