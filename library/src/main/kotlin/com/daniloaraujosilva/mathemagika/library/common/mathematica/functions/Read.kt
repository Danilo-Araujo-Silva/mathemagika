package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Read
 *
 * Full name:        System`Read
 *
 *                   Read[stream] reads one expression from an input stream and returns the expression.
 *                   Read[stream, type] reads one object of the specified type.
 *                   Read[stream, {type , type , …}] reads a sequence of objects of the specified types.
 * Usage:                              1      2
 *
 *                   NullRecords -> False
 *                   NullWords -> False
 *                   RecordSeparators -> {
, ,
}
 *
 *                   TokenWords -> {}
 * Options:          WordSeparators -> { , 	}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Read
 * Documentation:    web: http://reference.wolfram.com/language/ref/Read.html
 *
 *                   Read[ProcessLink`Private`s_InputStream, ProcessLink`Private`type:Record | Word, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] /; ProcessLink`Private`processStreamQ[ProcessLink`Private`s] && ProcessLink`Private`processStreamRead =!= True := Block[{ProcessLink`Private`p = ProcessLink`Private`findProcessFromStream[ProcessLink`Private`s], ProcessLink`Private`processStreamRead = True}, While[ProcessLink`Private`processRunningQ[ProcessLink`Private`p]]; If[ProcessLink`Private`checkUnicode[ProcessLink`Private`p, ProcessLink`Private`s], ProcessLink`Private`convertUnicode[Read[ProcessLink`Private`s, ProcessLink`Private`type, ProcessLink`Private`args, ProcessLink`Private`opts]], Read[ProcessLink`Private`s, ProcessLink`Private`type, ProcessLink`Private`args, ProcessLink`Private`opts]]]
 * Definitions:      Read[ProcessLink`Private`s_InputStream, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] /; ProcessLink`Private`processStreamQ[ProcessLink`Private`s] && ProcessLink`Private`processStreamRead =!= True := Block[{ProcessLink`Private`p = ProcessLink`Private`findProcessFromStream[ProcessLink`Private`s], ProcessLink`Private`processStreamRead = True}, While[Developer`EndOfStreamQ[ProcessLink`Private`s] && ProcessLink`Private`processRunningQ[ProcessLink`Private`p]]; If[ProcessLink`Private`checkUnicode[ProcessLink`Private`p, ProcessLink`Private`s], ProcessLink`Private`convertUnicode[Read[ProcessLink`Private`s, ProcessLink`Private`args, ProcessLink`Private`opts]], Read[ProcessLink`Private`s, ProcessLink`Private`args, ProcessLink`Private`opts]]]
 *
 * Own values:       None
 *
 *                   Read[ProcessLink`Private`s_InputStream, ProcessLink`Private`type:Record | Word, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] /; ProcessLink`Private`processStreamQ[ProcessLink`Private`s] && ProcessLink`Private`processStreamRead =!= True := Block[{ProcessLink`Private`p = ProcessLink`Private`findProcessFromStream[ProcessLink`Private`s], ProcessLink`Private`processStreamRead = True}, While[ProcessLink`Private`processRunningQ[ProcessLink`Private`p]]; If[ProcessLink`Private`checkUnicode[ProcessLink`Private`p, ProcessLink`Private`s], ProcessLink`Private`convertUnicode[Read[ProcessLink`Private`s, ProcessLink`Private`type, ProcessLink`Private`args, ProcessLink`Private`opts]], Read[ProcessLink`Private`s, ProcessLink`Private`type, ProcessLink`Private`args, ProcessLink`Private`opts]]]
 * Down values:      Read[ProcessLink`Private`s_InputStream, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] /; ProcessLink`Private`processStreamQ[ProcessLink`Private`s] && ProcessLink`Private`processStreamRead =!= True := Block[{ProcessLink`Private`p = ProcessLink`Private`findProcessFromStream[ProcessLink`Private`s], ProcessLink`Private`processStreamRead = True}, While[Developer`EndOfStreamQ[ProcessLink`Private`s] && ProcessLink`Private`processRunningQ[ProcessLink`Private`p]]; If[ProcessLink`Private`checkUnicode[ProcessLink`Private`p, ProcessLink`Private`s], ProcessLink`Private`convertUnicode[Read[ProcessLink`Private`s, ProcessLink`Private`args, ProcessLink`Private`opts]], Read[ProcessLink`Private`s, ProcessLink`Private`args, ProcessLink`Private`opts]]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun read(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Read", arguments.toMutableList(), options)
}
