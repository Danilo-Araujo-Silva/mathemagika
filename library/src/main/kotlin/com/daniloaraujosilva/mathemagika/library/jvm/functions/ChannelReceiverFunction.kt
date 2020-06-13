package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ChannelReceiverFunction
 *
 * Full name:        System`ChannelReceiverFunction
 *
 * Usage:            ChannelReceiverFunction[fun] represents a channel receiver function that applies fun to any channel message it receives.
 *
 * Options:          LoggingFunction -> None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ChannelReceiverFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChannelReceiverFunction.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        CloudDeploy[ChannelReceiverFunction[ChannelReceiver`Private`fargs___], (ChannelReceiver`Private`args___)?ChannelReceiver`Private`notOptionQ, (ChannelReceiver`Private`opts___)?OptionQ] ^:= Catch[ChannelReceiver`Private`clouddeploy[{ChannelReceiver`Private`fargs}, {Automatic}, {ChannelReceiver`Private`args}, {ChannelReceiver`Private`opts}]]
 *
 *                   ChannelReceiverFunction[(ChannelReceiver`Private`args___)?ChannelReceiver`Private`notOptionQ, ChannelReceiver`Private`opts:OptionsPattern[]][ChannelReceiver`Private`sargs___] := ChannelReceiver`Private`crf[{ChannelReceiver`Private`args}, Hold[{ChannelReceiver`Private`sargs}], Quiet[OptionValue["LoggingFunction"]], ChannelReceiver`Private`opts] /;  !ChannelReceiver`Private`$logFunc
 *                   ChannelReceiverFunction[(ChannelReceiver`Private`args___)?ChannelReceiver`Private`notOptionQ, ___?OptionQ][___] := $Failed /;  !ArgumentCountQ[ChannelReceiverFunction, Length[{ChannelReceiver`Private`args}], 1, 1]
 * Sub values:       ChannelReceiverFunction[ChannelReceiver`Private`f_, ChannelReceiver`Private`opts:OptionsPattern[]][ChannelReceiver`Private`s_, ___] := Catch[OptionValue["LoggingFunction"]; ChannelReceiver`Private`doCrf[ChannelReceiver`Private`f, ChannelReceiver`Private`s, {ChannelReceiver`Private`opts}]]
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun channelReceiverFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChannelReceiverFunction", arguments.toMutableList(), options)
}
