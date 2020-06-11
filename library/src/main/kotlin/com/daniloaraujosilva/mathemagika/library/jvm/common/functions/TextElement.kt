package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TextElement
 *
 * Full name:        System`TextElement
 *
 *                   TextElement[text, props] represents an element of text with the specified properties.
 *                   TextElement[{elem , elem , …}, props] represents text formed from a sequence of elements.
 *                                    1      2
 * Usage:            TextElement[elems] represents text where no properties are specified.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/TextElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextElement.html
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
fun textElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextElement", arguments.toMutableList(), options)
}
