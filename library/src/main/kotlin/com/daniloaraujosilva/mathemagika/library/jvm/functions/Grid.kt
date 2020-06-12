package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Grid
 *
 * Full name:        System`Grid
 *
 *                   Grid[{{expr  , expr  , …}, {expr  , expr  , …}, …}] is an object that formats with the expr   arranged in a two-dimensional grid.
 * Usage:                       11      12           21      22                                                 ij
 *
 *                   Alignment -> {Center, Baseline}
 *                   AllowedDimensions -> Automatic
 *                   AllowScriptLevelChange -> True
 *                   AutoDelete -> False
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> Grid
 *                   DefaultElement -> 
 *                   DeleteWithContents -> True
 *                   Dividers -> {}
 *                   Editable -> Automatic
 *                   Frame -> None
 *                   FrameStyle -> Automatic
 *                   ItemSize -> Automatic
 *                   ItemStyle -> None
 *                   Selectable -> Automatic
 * Options:          Spacings -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Grid
 * Documentation:    web: http://reference.wolfram.com/language/ref/Grid.html
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
fun grid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Grid", arguments.toMutableList(), options)
}
