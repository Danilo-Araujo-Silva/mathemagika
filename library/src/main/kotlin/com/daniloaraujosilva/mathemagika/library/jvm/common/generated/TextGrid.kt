package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TextGrid
 * 
 * Full name:        System`TextGrid
 * 
 *                   TextGrid[{{expr  , expr  , …}, {expr  , expr  , …}, …}] is an object that formats expr   textually and arranged in a two-dimensional grid. 
 * Usage:                           11      12           21      22                                        ij
 * 
 *                   Alignment -> {Left, Baseline}
 *                   AllowedDimensions -> Automatic
 *                   AllowScriptLevelChange -> True
 *                   AutoDelete -> False
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> TextGrid
 *                   DefaultElement -> Cell[]
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
 *                   local: paclet:ref/TextGrid
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextGrid.html
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
fun textGrid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextGrid", arguments.toMutableList(), options)
}
