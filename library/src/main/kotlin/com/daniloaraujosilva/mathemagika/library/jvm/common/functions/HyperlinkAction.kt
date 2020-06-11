package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HyperlinkAction
 *
 * Full name:        System`HyperlinkAction
 *
 * Usage:            HyperlinkAction is an option for Hyperlink that controls the behavior of following links in cloud notebooks.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HyperlinkAction
 * Documentation:    web: http://reference.wolfram.com/language/ref/HyperlinkAction.html
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
fun hyperlinkAction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HyperlinkAction", arguments.toMutableList(), options)
}
