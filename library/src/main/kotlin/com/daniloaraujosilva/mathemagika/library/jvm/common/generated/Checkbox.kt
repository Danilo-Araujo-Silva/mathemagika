package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Checkbox
 * 
 * Full name:        System`Checkbox
 * 
 *                   Checkbox[x] represents a checkbox with setting x, displayed as CheckboxBox[True] when x is True and CheckboxBox[False] when x is False. 
 *                   Checkbox[Dynamic[x]] takes the setting to be the dynamically updated current value of x, with the value of x being toggled if the checkbox is clicked. 
 *                   Checkbox[x, {val , val }] represents a checkbox that toggles between values val  and val  and displays as CheckboxBox[False] and CheckboxBox[True], respectively. 
 *                                   1     2                                                        1        2
 *                   Checkbox[x, {val , val , val , …}] represents a checkbox that cycles through values val  and displays as CheckboxBox[3, {1, 2, 3}] for all val  with i > 2. 
 * Usage:                            1     2     3                                                          i                                                      i
 * 
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> False
 *                   DefaultBaseStyle -> Checkbox
 *                   Enabled -> Automatic
 * Options:          ImageMargins -> 0
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Checkbox
 * Documentation:    web: http://reference.wolfram.com/language/ref/Checkbox.html
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
fun checkbox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Checkbox", arguments.toMutableList(), options)
}
