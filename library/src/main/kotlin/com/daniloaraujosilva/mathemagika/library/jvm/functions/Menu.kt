package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Menu
 *
 * Full name:        System`Menu
 *
 * Usage:            System`Menu
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 *
 * Definitions:      Menu["", RobotTools`Menu`Private`args___] := Menu["Mathematica", RobotTools`Menu`Private`args]
 *
 * Own values:       None
 *
 * Down values:      Menu["", RobotTools`Menu`Private`args___] := Menu["Mathematica", RobotTools`Menu`Private`args]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun menu(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Menu", arguments.toMutableList(), options)
}
