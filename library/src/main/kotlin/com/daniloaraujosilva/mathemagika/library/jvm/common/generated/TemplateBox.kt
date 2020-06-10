package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TemplateBox
 * 
 * Full name:        System`TemplateBox
 * 
 *                   TemplateBox[{box , box , …}, tag] is a low-level box structure that parameterizes the display and evaluation of the boxes box .
 * Usage:                            1     2                                                                                                      i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TemplateBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemplateBox.html
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
fun templateBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemplateBox", arguments.toMutableList(), options)
}
