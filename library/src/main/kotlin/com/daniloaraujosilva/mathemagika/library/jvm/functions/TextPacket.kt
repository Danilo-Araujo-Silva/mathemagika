package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TextPacket
 *
 * Full name:        System`TextPacket
 *
 * Usage:            TextPacket[string] is a WSTP packet containing string, the text output from the Wolfram System as produced by functions such as Print.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TextPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextPacket.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 *                   System`Dump`PacketHandler[TextPacket[System`Dump`text_String], System`Dump`source_] ^:= Block[{}, If[ValueQ[$FrontEnd] && $FrontEnd =!= Null, CellPrint[Cell[StringReplace[System`Dump`text, RegularExpression["\\n$"] -> ""], "Print", CellLabel -> System`Dump`sourceString[System`Dump`source], ShowCellLabel -> True]], System`Dump`printLabelled[System`Dump`text, System`Dump`source]]]
 * Up values:        Parallel`Protected`PacketHandler[TextPacket[Parallel`Kernels`Private`text_String], Parallel`Kernels`Private`kernel_] ^:= Parallel`Kernels`Private`printLabelled[Parallel`Kernels`Private`text, Parallel`Kernels`Private`kernel]
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun textPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextPacket", arguments.toMutableList(), options)
}
