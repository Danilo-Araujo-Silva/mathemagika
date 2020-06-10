package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Column
 * 
 * Full name:        System`Column
 * 
 *                   Column[{expr , expr , …}] is an object that formats with the expr  arranged in a column, with expr  above expr , etc. 
 *                               1      2                                             i                                1           2
 *                   Column[list, alignment] aligns each element horizontally in the specified way. 
 * Usage:            Column[list, alignment, spacing] leaves the specified number of x-heights of spacing between successive elements.
 * 
 *                   Alignment -> {Left, Baseline}
 *                   AllowedDimensions -> Automatic
 *                   AllowScriptLevelChange -> True
 *                   AutoDelete -> False
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> Column
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
 *                   local: paclet:ref/Column
 * Documentation:    web: http://reference.wolfram.com/language/ref/Column.html
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
fun column(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Column", arguments.toMutableList(), options)
}
