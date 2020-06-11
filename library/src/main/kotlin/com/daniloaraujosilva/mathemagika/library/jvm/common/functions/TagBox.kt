package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TagBox
 *
 * Full name:        System`TagBox
 *
 * Usage:            TagBox[boxes, tag] is a low-level box construct that displays as boxes but maintains tag to guide the interpretation of boxes on input.
 *
 *                   AutoDelete -> False
 *                   DeletionWarning -> False
 *                   Editable -> True
 *                   FormatType -> Automatic
 *                   Selectable -> True
 *                   StripWrapperBoxes -> False
 * Options:          SyntaxForm -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TagBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/TagBox.html
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
fun tagBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TagBox", arguments.toMutableList(), options)
}
