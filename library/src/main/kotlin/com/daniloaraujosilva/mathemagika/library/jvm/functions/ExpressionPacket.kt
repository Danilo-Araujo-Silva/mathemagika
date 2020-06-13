package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ExpressionPacket
 *
 * Full name:        System`ExpressionPacket
 *
 * Usage:            System`ExpressionPacket
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        System`Dump`PacketHandler[ExpressionPacket[System`Dump`cont_], System`Dump`source_] ^:= Block[{}, If[ValueQ[$FrontEnd] && $FrontEnd =!= Null, CellPrint[Cell[System`Dump`cont, "Print", CellLabel -> System`Dump`sourceString[System`Dump`source], ShowCellLabel -> True]], None]]
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun expressionPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpressionPacket", arguments.toMutableList(), options)
}
