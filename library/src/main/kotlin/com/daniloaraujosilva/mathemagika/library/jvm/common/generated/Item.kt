package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Item
 * 
 * Full name:        System`Item
 * 
 * Usage:            Item[expr, options] represents an item within constructs such as Grid, Overlay, and Manipulate that displays with expr as the content, and with the specified options applied to the region containing expr. 
 * 
 *                   Alignment -> {}
 *                   AllowScriptLevelChange -> True
 *                   Background -> Automatic
 *                   BaseStyle -> {}
 *                   ControlPlacement -> Automatic
 *                   DefaultBaseStyle -> {}
 *                   DefaultFrameStyle -> {}
 *                   Frame -> {}
 *                   FrameStyle -> {}
 *                   ItemSize -> {}
 * Options:          StripOnInput -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Item
 * Documentation:    web: http://reference.wolfram.com/language/ref/Item.html
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
fun item(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Item", arguments.toMutableList(), options)
}
