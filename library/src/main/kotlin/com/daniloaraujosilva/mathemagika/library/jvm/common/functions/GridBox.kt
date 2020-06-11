package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GridBox
 *
 * Full name:        System`GridBox
 *
 *                   GridBox[{{box  , box  , …}, {box  , box  , …}, …}] is a low-level box construct that represents a two-dimensional grid of boxes or strings in notebook expressions.
 * Usage:                         11     12          21     22
 *
 *                   ColumnAlignments -> Center
 *                   ColumnSpacings -> 1.
 *                   EqualColumns -> False
 *                   EqualRows -> False
 *                   GridBaseline -> Axis
 *                   MultilineFunction -> None
 *                   RowAlignments -> Baseline
 *                   RowMinHeight -> True
 * Options:          RowSpacings -> 0.5
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GridBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/GridBox.html
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
fun gridBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GridBox", arguments.toMutableList(), options)
}
