package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GraphicsGroup
 *
 * Full name:        System`GraphicsGroup
 *
 *                   GraphicsGroup[{g , g , …}] represents a collection of graphics objects grouped together for purposes of interactive selection in a notebook.
 * Usage:                            1   2
 *
 * Options:          ContentSelectable -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphicsGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphicsGroup.html
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
fun graphicsGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphicsGroup", arguments.toMutableList(), options)
}
